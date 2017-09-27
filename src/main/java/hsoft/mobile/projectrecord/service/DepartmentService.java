package hsoft.mobile.projectrecord.service;

import java.util.Map;

/**
 * create by TX on 2017/9/26
 */
public interface DepartmentService {

    /**
     * 创建部门信息
     * @param map 部门信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);

    /**
     * 修改部门信息
     * @param map 部门信息
     * @return 结果json
     */
    String processUpdate(Map<String, String> map);

    /**
     * 根据传入的主键id删除部门信息
     * @param map 部门信息
     * @return 结果json
     */
    String processDelete(Map<String, String> map);

    /**
     * 获取部门信息列表
     * @return 结果json
     */
    String processList();
}
