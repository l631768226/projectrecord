package hsoft.mobile.projectrecord.service;

import java.util.Map;

/**
 * create by TX on 2017/9/27
 */
public interface IssueCategoryService {

    /**
     * 创建问题类型信息
     * @param map 问题类型信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);

    /**
     * 修改问题类型信息
     * @param map 问题类型信息
     * @return 结果json
     */
    String processUpdate(Map<String, String> map);

    /**
     * 根据传入的主键id删除问题类型信息
     * @param map 问题类型信息
     * @return 结果json
     */
    String processDelete(Map<String, String> map);

    /**
     * 获取问题类型信息列表
     * @return 结果json
     */
    String processList();
}
