package hsoft.mobile.projectrecord.service;

import hsoft.mobile.projectrecord.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface TokenService {

    /**
     * 获取cookie信息对比redis中存储的token信息
     * @return true成功/false失败
     */
    public boolean processCheckToken();

    /**
     * 登录时调用，创建并存储token
     * param map 登录时传入的数据
     * @param request http请求
     * @param response http返回
     * @return 结果字段
     */
    public String processLogin(Map<String, String> map, HttpServletRequest request, HttpServletResponse response);

    /**
     * 退出系统，删除token
     * @param response http返回
     */
    public void processExit(HttpServletResponse response);

    /**
     * 根据http请求中的cookie获取redis中存储的token的具体数据（User）
     * @return 用户信息model
     */
    public User processUser();
}
