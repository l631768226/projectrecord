package hsoft.mobile.projectrecord.service;

import java.util.Map;

public interface StatusService {

    /**
     * 新增状态类型信息
     * @param map 传入的状态类型信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);
}
