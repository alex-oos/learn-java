package com.springboot.controller;


import com.springboot.commom.R;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


/**
 * @program: springbootdemo
 * @since 2019/1/25 15:03
 * @author Mr.Zheng
 * @Description:
 */
@Slf4j
@RestController
@Api(description = "test")
@RequestMapping("/redis")
public class RedisController {

    private static final int ExpireTime = 60;   // redis中存储的过期时间60s

    // @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @GetMapping("set")
    public R<?> redisSet(String key, String value, int score) {


        Boolean isSuccess = redisTemplate.opsForZSet().add(key, value, score);
        R apiResult = Boolean.TRUE.equals(isSuccess) ? R.ok("set成功") : R.failed("set失败");
        return apiResult;

    }

    @GetMapping("get")
    public Object redisGet(String key) {

        Set<Object> objects = redisTemplate.opsForZSet().reverseRange(key, 0, -1);
        return objects;
    }

    @GetMapping("delete")
    public R<?> redisDelete(String key) {

        return Boolean.TRUE.equals(redisTemplate.delete(key)) ? R.ok("删除成功") : R.failed("删除失败");

    }

}
