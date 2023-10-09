package com.springboot.controller;


import com.springboot.config.UserConfig;
import com.springboot.utils.ConstantPropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 * @date 2021/8/27 7:57 下午
 * <P></p>
 */
/*解决跨域*/
@CrossOrigin(originPatterns = "*", allowCredentials = "true", maxAge = 3600)
@RestController
public class HelloController {

    @Autowired
    private UserConfig userConfig;

    @GetMapping("readData")
    public String readData() {

        String tmp = "id: " + ConstantPropertiesUtil.ID + "name: " + ConstantPropertiesUtil.NAME + "password: " +
                ConstantPropertiesUtil.PASSWORD + "===" + userConfig.getId();
        return tmp;
    }

}
