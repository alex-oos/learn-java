package com.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiParam;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 运行表
 * </p>
 *
 * @author baomidou
 * @since 2023-10-24
 */
@Data
@Builder
@TableName("run_set_rules")
public class RunSetRulesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 检查套餐名称
     */
    @ApiParam(value = "检查套餐名称")
    @NotBlank
    private String set_name;

    /**
     * 检查项逗号分割
     */
    @NotBlank
    @ApiParam(value = "检查项逗号分割")
    private String rules;

    /**
     * 创建时间
     */
    private LocalDateTime create_time;

    /**
     * 更新时间
     */
    private LocalDateTime update_time;

}
