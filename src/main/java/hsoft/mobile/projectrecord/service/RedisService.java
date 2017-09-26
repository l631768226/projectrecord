package hsoft.mobile.projectrecord.service;

public interface RedisService {

    /**
     * 使用redis保存键值对
     * @param key 键
     * @param value 值
     * @return true成功/false失败
     */
    public boolean save(String key, String value);

    /**
     * 根据键查找redis中的对应值
     * @param key 键
     * @return 键对应的值，不存在则返回null
     */
    public String find(String key);

    /**
     * 根据键删除redis中的对应值
     * @param key 键
     * @return true成功/false失败
     */
    public boolean remove(String key);
}
