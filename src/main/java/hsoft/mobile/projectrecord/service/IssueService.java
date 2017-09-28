package hsoft.mobile.projectrecord.service;

import java.util.Map;

/**
 * create by TX on 2017/9/26
 */
public interface IssueService {

    /**
     * 创建问题信息
     * @param map 问题信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);

    /**
     * 修改问题信息
     * @param map 问题信息
     * @return 结果json
     */
    String processUpdate(Map<String, String> map);

    /**
     * 根据传入的主键id删除问题信息
     * @param map 问题信息
     * @return 结果json
     */
    String processDelete(Map<String, String> map);

    /**
     * 获取问题信息列表
     * @return 结果json
     */
    String processList();
}
