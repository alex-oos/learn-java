package com.mybatisplus.controller;

import com.mybatisplus.config.annotation.WebLog;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description
 * @Author Alex
 * @Date 2024/1/21 22:45
 * @Version 1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @WebLog
    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "test";
    }

    @WebLog
    @PostMapping("/test2")
    public String test2(@RequestBody JSONObject jsonObject) {
        System.out.println("test2");
        return "test2";
    }

}
