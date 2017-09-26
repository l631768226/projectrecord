package hsoft.mobile.projectrecord.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public boolean save(String key, String value) {
        try {
            //使用redis保存键值对
            stringRedisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //如果出现异常，返回false
        return false;
    }

    @Override
    public String find(String key) {
        try {
            //根据键获取redis中的对应值
            String resulstCode = stringRedisTemplate.opsForValue().get(key);
            return  resulstCode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //如果出现异常，返回null
        return null;
    }

    @Override
    public boolean remove(String key) {
        try {
            stringRedisTemplate.opsForValue().set(key, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //如果出现异常，返回null
        return false;
    }
}
