package hsoft.mobile.projectrecord.service;

import java.util.Map;

public interface ProjectService {

    /**
     * 新增项目信息
     * @param map 传入的项目信息
     * @return 结果json
     */
    String processCreate(Map<String, String> map);
}
