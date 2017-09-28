package hsoft.mobile.projectrecord.service;

import java.util.Map;

public interface StatusService {

    /**
     * 新增状态类型信息
     * @param map 传入的状态类型信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);

    /**
     * 更新状态类型信息
     * @param map 传入的状态类型信息
     * @return 结果json
     */
    String processUpdate(Map<String, String> map);

    /**
     * 删除状态类型信息
     * @param map 传入的状态类型信息
     * @return 结果json
     */
    String processDelete(Map<String, String> map);

    /**
     * 获取状态类型信息列表
     * @return 结果json
     */
    String processList();
}
