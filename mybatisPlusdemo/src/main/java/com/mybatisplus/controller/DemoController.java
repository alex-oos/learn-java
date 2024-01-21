package com.mybatisplus.controller;

import com.alibaba.fastjson2.JSONObject;
import com.mybatisplus.annotation.WebLog;
import com.mybatisplus.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/demo")
    public JSONObject demo(@RequestParam("name") String name) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        return jsonObject;
    }

    @WebLog
    @PostMapping("/user")
    public JSONObject user(@RequestBody User user) {
        return JSONObject.parseObject(JSONObject.toJSONString(user));
    }

}
