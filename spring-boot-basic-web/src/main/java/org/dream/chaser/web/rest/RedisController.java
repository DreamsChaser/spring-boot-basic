package org.dream.chaser.web.rest;

import org.dream.chaser.server.redis.RedisCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/9 10:17
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisCommand redisCommand;

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    @ResponseBody
    public void set(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        redisCommand.set(key,value);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestParam(value = "key") String key) {
        return redisCommand.get(key);
    }
}
