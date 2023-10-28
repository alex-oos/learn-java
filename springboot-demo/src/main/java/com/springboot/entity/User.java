package com.springboot.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Auther: Alex
 * @since 2021/1/21 13:42
 * @Descprition:
 */

@Data
public class User {

    // 实现自增，必须数据库中设置自增
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private Integer age;

    private String email;

    private String password;

    private Integer managerId;

    // 自动填充，插入的时候，自动加入时间
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // 自动填充，更新的时候自动加入时间
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

}
