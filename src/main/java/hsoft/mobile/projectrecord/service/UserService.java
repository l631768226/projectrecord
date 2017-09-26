package hsoft.mobile.projectrecord.service;

import hsoft.mobile.projectrecord.model.User;

import java.util.Map;

public interface UserService {

    /**
     * 登录功能之一 根据用户名和密码查找用户信息model
     * @param map 登录时传入的数据（username，password）
     * @return 成功时返回用户信息model/失败时返回null
     */
    User processLogin(Map<String, String> map);

    /**
     * 新增人员信息
     * @param map 传入的人员信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);

    /**
     * 修改人员信息
     * @param map 传入的人员信息
     * @return 结果json
     */
    String processUpdate(Map<String, String> map);

    /**
     * 获取用户列表
     * @return 结果json
     */
    String processList();

    /**
     * 根据技能获取用户列表
     * @param map 传入的技能信息
     * @return 结果json
     */
    String processSkillList(Map<String, String> map);
}
