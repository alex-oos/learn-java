package com.springboot.entity.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author LiJiang
 * @since 2021/6/23 15:32
 */
@Schema(description = "登录实体类")
@Data
public class LoginVo implements Serializable {

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;

}