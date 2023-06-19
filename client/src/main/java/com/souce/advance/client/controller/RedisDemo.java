package com.souce.advance.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RedisDemo
 * @description
 * @author lihuanmin
 * @date 2023-6-19 10:33
 * @version 1.0
 */
@RestController
@RequestMapping("/redis")
public class RedisDemo {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @GetMapping
    public String demo () {
        return redisTemplate.opsForValue().get("1");
    }

}

