package org.dream.chaser.server.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/9 9:59
 */
@Configuration
public class RedisClusterConfiguration {

    @Bean
    public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory redisConnectionfactory){
        RedisTemplate<String,String> redisTemplate=new RedisTemplate<>();
        //配置redis连接工厂(application.properties中配置的，也可以通过自定义RedisConnectionFactory手动配置)
        redisTemplate.setConnectionFactory(redisConnectionfactory);
        //key序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //value序列化方式
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        //初始化
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

}
