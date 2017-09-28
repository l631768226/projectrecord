package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import hsoft.mobile.projectrecord.model.CheckResult;
import hsoft.mobile.projectrecord.model.ResultCode;
import hsoft.mobile.projectrecord.model.User;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private RedisService redisService;
    @Autowired
    private UserService userService;

    private boolean localtest = true;

    @Override
    public boolean processCheckToken() {
        try {
            Cookie cookie = getCookie();
            if (cookie == null) {
                return false;
            }
            String value = redisService.find(cookie.getValue());
            System.out.println("the value = " + value);
            if (value != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String processLogin(Map<String, String> map, HttpServletRequest request, HttpServletResponse response) {
        ResultCode<User> resultCode = new ResultCode<User>();
        Gson gson = new Gson();
        resultCode.setRs(-1);
        User user = userService.processLogin(map);
        if(user == null){
            resultCode.setMsg("用户名或密码不正确");
            return gson.toJson(resultCode);
        }
        try {
            user.setPassword("");
            System.out.println(gson.toJson(user));
            //取登录用户id和当前时间，MD5加密作为token
            String value = Common.toMD5(user.getUserid()
                    + "");
                    //+ System.currentTimeMillis());
            Cookie cookie = new Cookie("token", value);
            //设置cookie有效期为7天
            cookie.setMaxAge(7 * 24 * 60 *60);
            response.addCookie(cookie);
            redisService.save(value, gson.toJson(user));
            resultCode.setValue(user);
            resultCode.setRs(1);
        } catch (Exception e) {
            e.printStackTrace();
            resultCode.setMsg("服务器错误");
        }
        //本地测试时不使用加解密
        if(localtest){
            return gson.toJson(resultCode);
        }
        return FBase64.encode(gson.toJson(resultCode).getBytes());
    }

    @Override
    public void processExit(HttpServletResponse response) {
        try {
            Cookie cookie = getCookie();
            if(cookie == null){
                return;
            }
            //根据键获取redis中对应的值
            String value = redisService.find(cookie.getValue());
            //如果redis中存在键值，设置cookie为null
            if(value != null){
                redisService.remove(cookie.getValue());
                cookie = new Cookie("token", null);
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User processUser() {
        try {
            Cookie cookie = getCookie();
            if(cookie == null){
                return null;
            }
            String value = redisService.find(cookie.getValue());
            if(value != null){
                Gson gson = new Gson();
                return gson.fromJson(value, User.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void processCheckUser(CheckResult checkResult, boolean isCheckAuthority) {
        try {
            User user = processUser();
            if (isCheckAuthority && user.getAuthority() != 1 && user.getAuthority() != 2) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("对不起，您没有权限");
            }
            checkResult.setCheckCode(1);
            checkResult.setOperatorId(user.getUserid());
        } catch (Exception e) { // 用户没有登录，返回信息
            e.printStackTrace();
            checkResult.setCheckCode(-400);
            checkResult.setCheckMsg("用户没有登录");
        }
    }


    /**
     * 获取浏览器的cookie
     *
     * @return 存在时返回cookie，不存在时返回null
     */
    private Cookie getCookie() {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    return cookie;
                }
            }
        }
        return null;
    }
}
