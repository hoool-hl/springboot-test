package com.hlcoding.redisteststringboot.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello springboot");
        stringRedisTemplate.opsForValue().set("hello","nihao");
        String str = stringRedisTemplate.opsForValue().get("hello");
        System.out.println(str);
        return "springboot hello";
    }
}
