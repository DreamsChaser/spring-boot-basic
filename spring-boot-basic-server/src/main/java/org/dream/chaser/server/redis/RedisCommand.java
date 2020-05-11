package org.dream.chaser.server.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/9 9:58
 */
@Component
public class RedisCommand {

    @Autowired
    RedisTemplate<String,String> redisTemplate;

    public void set(String key,String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
