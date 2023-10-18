package com.springboot.config;


import com.springboot.utils.YmlFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Alex
 * @since 2021/8/28 11:51 下午
 * <P>
 * 成为一个配置类去读取yml 里面的文件
 * </p>
 */


@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "user")
@PropertySource(value = "classpath:data/data.yml", encoding = "UTF-8", factory = YmlFactory.class)
public class UserConfig {

    private String name;

    private String id;

    private String password;

}
