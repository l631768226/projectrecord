package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import com.sun.istack.internal.Nullable;
import hsoft.mobile.projectrecord.dao.SkillDao;
import hsoft.mobile.projectrecord.dao.UserDao;
import hsoft.mobile.projectrecord.mapper.SkillMapper;
import hsoft.mobile.projectrecord.mapper.UserMapper;
import hsoft.mobile.projectrecord.model.*;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SkillMapper skillMapper;
    @Autowired
    private SkillDao skillDao;

    private boolean localtest = Common.localtest;

    @Override
    public User processLogin(Map<String, String> map) {
        try {
            String username = map.get("username");
            if(localtest){
                username = new String(FBase64.decode(username));
            }
            String password = Common.toMD5(map.get("password"));
            if(localtest){
                password = new String(FBase64.decode(password));
            }
            return userDao.processLogin(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String processCreate(Map<String, String> map){
        Gson gson = new Gson();
        ResultCode<User> resultCode = new ResultCode<User>();
        CheckResult checkResult = processCheck(map, true);
        if (checkResult.getCheckCode() > 0) {
            //如果通过校验
            try {
                User user = processModel(map);
                if(processDB(user, true)){
                    //如果数据库中不存在相同的用户名 则可以插入
                    Date date = new Date();
                    user.setCreateid(checkResult.getOperatorId());
                    user.setCreatetime(date);
                    userMapper.insertSelective(user);

                    if(map.get("skill") != null && !"".equals(map.get("skill").trim())){
                        //如果传入了技能相关的字段， 准备数据，将技能信息插入到技能表中
                        Skill skill = new Skill();
                        skill.setCreateid(checkResult.getOperatorId());
                        skill.setCreatetime(date);
                        skill.setUserid(user.getUserid());
                        processSkill(skill, map.get("skill"));
                    }

                    resultCode.setRs(1);
                    resultCode.setValue(user);
                }else{
                    //如果存在，则返回结果
                    resultCode.setRs(-1);
                    resultCode.setMsg("该用户名已存在");
                }
            } catch (UnsupportedEncodingException e) {
                //插入数据库失败，返回结果
                e.printStackTrace();
                resultCode.setRs(-1);
                resultCode.setMsg("数据库插入操作错误");
            }
        } else {
            //如果没有通过校验,则组织返回结果数据
            resultCode.setRs(checkResult.getCheckCode());
            resultCode.setMsg(checkResult.getCheckMsg());
        }
        if (localtest) {
            return gson.toJson(resultCode);
        }
        return FBase64.encode(gson.toJson(resultCode).getBytes());
    }

    @Override
    public String processUpdate(Map<String, String> map) {
        Gson gson = new Gson();
        ResultCode<User> resultCode = new ResultCode<User>();
        CheckResult checkResult = processCheck(map, true);
        if (checkResult.getCheckCode() > 0) {
            //如果通过校验
            try {
                User user = processModel(map);
                if(processDB(user, false)){
                    //如果数据库中不存在相同的用户名 则可以更新
                    Date date = new Date();

                    int userId = user.getUserid();
                    User oldUser = userDao.findById(userId);
                    oldUser.setUsername(user.getUsername());
                    oldUser.setPassword(user.getPassword());
                    oldUser.setRealname(user.getRealname());
                    oldUser.setAuthority(user.getAuthority());

                    oldUser.setUpdateid(checkResult.getOperatorId());
                    oldUser.setUpdatetime(date);
                    userMapper.updateByPrimaryKeySelective(oldUser);

                    if(map.get("skill") != null && !"".equals(map.get("skill").trim())){
                        //首先将skill表中的相关数据删除
                        skillDao.deleteById(userId);
                        //再将修改的技能信息插入到skill表中
                        //如果传入了技能相关的字段， 准备数据，将技能信息插入到技能表中
                        Skill skill = new Skill();
                        skill.setCreateid(checkResult.getOperatorId());
                        skill.setCreatetime(date);
                        skill.setUserid(user.getUserid());
                        processSkill(skill, map.get("skill"));
                    }

                    resultCode.setRs(1);
                    resultCode.setValue(oldUser);
                }else{
                    //如果存在，则返回结果
                    resultCode.setRs(-1);
                    resultCode.setMsg("该用户名已存在");
                }
            } catch (UnsupportedEncodingException e) {
                //插入数据库失败，返回结果
                e.printStackTrace();
                resultCode.setRs(-1);
                resultCode.setMsg("数据库更新操作错误");
            }
        } else {
            //如果没有通过校验,则组织返回结果数据
            resultCode.setRs(checkResult.getCheckCode());
            resultCode.setMsg(checkResult.getCheckMsg());
        }
        if (localtest) {
            return gson.toJson(resultCode);
        }
        return FBase64.encode(gson.toJson(resultCode).getBytes());
    }

    @Override
    public String processList() {
        Gson gson = new Gson();
        ResultCode<List<User>> resultCode = new ResultCode<List<User>>();
        if (tokenService.processCheckToken()) {
            List<User> list = userDao.findList();
            if(list.isEmpty()){
                resultCode.setRs(-10);
                resultCode.setMsg("无数据");
            }else{
                resultCode.setRs(1);
                resultCode.setValue(list);
            }
        } else {
            resultCode.setRs(-400);
            resultCode.setMsg("用户没有登录");
        }
        if (localtest) {
            return gson.toJson(resultCode);
        }
        return FBase64.encode(gson.toJson(resultCode).getBytes());
    }

    /**
     * 校验用户信息
     *
     * @param map 用户信息
     * @return 校验结果的list 如果非空则校验不通过
     */
    private List<Validation> processValidation(Map<String, String> map) {
        List<Validation> validations = new ArrayList<Validation>();
        String username = "";
        String password = "";
        String realname = "";
        int authority = 0;
        try {
            username = map.get("username");
            password = map.get("password");
            realname = map.get("realname");
            String authorityStr = map.get("authority");
            if (localtest) {
                username = new String(FBase64.decode(username));
                password = new String(FBase64.decode(password));
                realname = new String(FBase64.decode(realname));
                authorityStr = new String(FBase64.decode(authorityStr));
            }
            authority = Integer.valueOf(authorityStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        validationService.verifyString("用户名", username, "validation",
                "6", "20", true, validations);
        validationService.verifyString("密码", password, "validation",
                "6", "20", true, validations);
        validationService.verifyString("真实姓名", realname, "chinese",
                "2", "3", true, validations);
        validationService.verifyInt("权限", authority, "number",
                1, 3, true, validations);
        return validations;
    }

    /**
     * 将前端传入的数据置入model中
     *
     * @param map 前端传入的信息
     * @return 平台信息model
     */
    private User processModel(Map<String, String> map) throws UnsupportedEncodingException {
        User user = new User();
        String userid = map.get("userId");
        String username = map.get("username");
        String password = map.get("password");
        String realname = map.get("realname");
        String authority = map.get("authority");
        if (userid != null && !"".equals(userid)) {
            if(!localtest){
                userid = new String(FBase64.decode(userid));
            }
            user.setUserid(Integer.valueOf(userid));
        }
        if (username != null && !"".equals(username)) {
            if(!localtest){
                username = new String(FBase64.decode(username));
            }
            user.setUsername(username);
        }
        if (password != null && !"".equals(password)) {
            if(!localtest){
                password = new String(FBase64.decode(password));
            }
            user.setPassword(password);
        }
        if (realname != null && !"".equals(realname)) {
            if(!localtest){
                realname = new String(FBase64.decode(realname));
            }
            user.setRealname(password);
        }
        if (authority != null && !"".equals(authority)) {
            if(!localtest){
                authority = new String(FBase64.decode(authority));
            }
            user.setAuthority(Integer.valueOf(authority));
        }
        return user;
    }

    /**
     * 登录校验，权限校验，传入信息校验（判空，判断长度）
     *
     * @param map         出入信息
     * @param isAuthority 是否进行权限判断
     * @return 校验结果 checkCode字段 < 0 则校验不通过
     */
    private CheckResult processCheck(@Nullable Map<String, String> map, boolean isAuthority) {
        CheckResult checkResult = new CheckResult();
        User user;
        //登录校验，获取登录人的信息
        try {
            user = tokenService.processUser();
            //如果需要权限校验,则进入判断进行权限校验
            if (isAuthority) {
                int authority = user.getAuthority();
                //权限校验
                if (authority != 1) {
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("对不起，您没有权限");
                    return checkResult;
                }
            }
        } catch (Exception e) {
            //进入到catch则说明用户没有登录，返回信息
            e.printStackTrace();
            checkResult.setCheckCode(-400);
            checkResult.setCheckMsg("用户没有登录");
            return checkResult;
        }
        //传入数据校验(包括判空和长度校验)
        List<Validation> validations = processValidation(map);
        if (!validations.isEmpty()) {
            //如果没通过校验
            Validation validation = validations.get(0);
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validation.getField() + validation.getError());
            return checkResult;
        }
        //若通过全部校验,则将操作人员的id置入checkresult并返回
        checkResult.setCheckCode(1);
        checkResult.setOperatorId(user.getUserid());
        return checkResult;
    }

    /**
     * 校验是否可以进行插入或修改操作
     *
     * @param user 用户信息
     * @param isCreate true创建时校验/false修改时校验
     * @return true可以/false不可以
     */
    private boolean processDB(User user, boolean isCreate) {
        List<User> list = new ArrayList<User>();
        try {
            if(isCreate) {
                list = userDao.findByUsername(user.getUsername());
                return list.isEmpty();
            }
            list = userDao.findByIdOrUsername(user.getUserid(), user.getUsername());
            return  list.size() <= 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 将传入的技能信息插入到表中
     * @param skill 技能信息
     * @param skillStr 传入的技能信息字符串 逗号分隔
     */
    private void processSkill(Skill skill , String skillStr) throws UnsupportedEncodingException {
        //若传入的技能字符串非空
        if(!Common.checkNull(skillStr)){
            if(!localtest){
                skillStr = new String(FBase64.decode(skillStr));
            }
            List<String> list = Common.strToList(skillStr);
            for(String str: list){
                skill.setPlatformid(Integer.valueOf(str));
                skillMapper.insertSelective(skill);
            }
        }
    }
}
