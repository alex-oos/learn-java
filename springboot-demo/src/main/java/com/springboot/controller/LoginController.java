package com.springboot.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.springboot.entity.vo.LoginVo;
import com.springboot.service.UserService;
import com.springboot.utils.HuJwtUtils;
import com.springboot.utils.ResultCode;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiJiang
 * @since 2021/6/23 15:29
 */

@RestController
@RequestMapping("/user")
@Tag(name = "login-controller", description = "登录控制器")
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @Operation(summary = "登录")
    @PostMapping("login")
    public R<?> login(
            @RequestBody LoginVo loginVo) {

        boolean isSucess = userService.login(loginVo);
        Map<String, Object> map = new HashMap<>();
        if (isSucess) {
            String token = HuJwtUtils.getJwtToken("1", loginVo.getUsername());
            map.put("token", token);
            log.info("token:{}", token);

            return R.ok(map).setCode(ResultCode.SUCCESS).setMsg("登录成功");

        } else {
            return R.failed("登录失败").setCode(ResultCode.ERROR);
        }
    }

    @Operation(summary = "退出登录")
    @PostMapping("logout")
    public R<?> logout() {

        Map<String, Object> map = new HashMap<>();
        map.put("token", "");
        return R.ok(map);
    }

}
