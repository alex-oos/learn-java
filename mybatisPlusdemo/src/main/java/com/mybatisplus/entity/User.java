package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Auther: 李将
 * @Date: 2021/1/21 13:42
 * @Descprition:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName(value = "user")
public class User implements Serializable {

    // 实现自增，必须数据库中设置自增
    @TableId(value = "id", type = IdType.AUTO) // 数据库ID自增，依赖于数据库。在插入操作生成SQL语句时，不会插入主键这一列
    private Long id;

    @TableField(condition = SqlCondition.LIKE) // 配置该字段使用like进行拼接
    private String name;

    @TableField(condition = "%s &gt; #{%s}") // 这里相当于大于, 其中 &gt; 是字符实体
    private Integer age;

    private String email;

    private Long managerId;

    /**
     * 自动填充，插入的时候，自动加入时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    // 自动填充，更新的时候自动加入时间
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;


    @TableLogic(value = "0", delval = "1")
    private Integer deleted;

}
