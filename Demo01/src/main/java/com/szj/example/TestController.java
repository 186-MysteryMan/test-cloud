package com.szj.example;

import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author shenggongjie
 * @date 2021/3/30 23:27
 */
@Component
@AllArgsConstructor
public class TestController {
    private RedisTemplate redisTemplate;
}
