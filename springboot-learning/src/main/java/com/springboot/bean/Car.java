package com.springboot.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Alex
 * @since 2021/8/5 12:01 下午
 * <P>
 * 配置绑定
 * 1、先注入到spring容器中，使用 Component注解
 * 2、@ConfigurationProperties(prefix = "car") 注意  prefix 里面的名字必须是小写
 * </p>
 */

@Component
@ConfigurationProperties(prefix = "car")
@Data
public class Car {

    private String bind;

    private Integer price;

}
