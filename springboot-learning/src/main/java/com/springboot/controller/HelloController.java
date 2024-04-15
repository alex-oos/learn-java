package com.springboot.controller;


import com.springboot.bean.Car;
import com.springboot.bean.Person;
import com.springboot.config.UserConfig;
import com.springboot.utils.ConstantPropertiesUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 * @since 2021/8/27 7:57 下午
 * <P></p>
 */

@Slf4j
// 解决跨域
@Api(value = "HelloController", tags = "hello 相关接口")
@CrossOrigin(originPatterns = "*", allowCredentials = "true", maxAge = 3600)
@RestController
public class HelloController {

    @Autowired
    private UserConfig userConfig;

    @Autowired
    Car car;

    @Autowired
    Person person;

    @GetMapping("readData")
    public String readData() {

        String tmp = "id: " + ConstantPropertiesUtil.ID + "name: " + ConstantPropertiesUtil.NAME + "password: " +
            ConstantPropertiesUtil.PASSWORD + "===" + userConfig.getId();
        return tmp;
    }


    @GetMapping("car")
    public Car car() {
        log.info("进入日志...");
        return car;
    }

    @GetMapping("person")
    public Person person() {

        return person;

    }

    @GetMapping("hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

}
