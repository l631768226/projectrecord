package hsoft.mobile.projectrecord.service;

import java.util.Map;

/**
 * create by LY on 2017/9/24
 */
public interface PlatformService {

    /**
     * 创建平台信息
     * @param map 平台信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);

    /**
     * 修改平台信息
     * @param map 平台信息
     * @return 结果json
     */
    String processUpdate(Map<String, String> map);

    /**
     * 根据传入的主键id删除平台信息
     * @param map 平台信息
     * @return 结果json
     */
    String processDelete(Map<String, String> map);

    /**
     * 获取平台信息列表
     * @return 结果json
     */
    String processList();
}
