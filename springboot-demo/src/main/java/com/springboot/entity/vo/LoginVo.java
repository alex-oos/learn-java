package com.springboot.entity.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author LiJiang
 * @since 2021/6/23 15:32
 */
@Schema(description = "登录实体类")
@Data
public class LoginVo implements Serializable {

    @NotBlank(message = "username is not null")
    @Schema(description = "用户名")
    private String username;

    @Min(value = 6, message = "密码不得少于6位")
    @NotBlank(message = "password is not null")
    @Schema(description = "密码")
    private String password;

}
