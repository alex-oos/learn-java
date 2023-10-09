package com.springboot.utils;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Alex
 * @date 2021/8/27 7:48 下午
 * <p>
 * 使用@value 读取配置中的文件，默认是application.yml 文件，也可以指定路径，使用 @PropertySource 可以指定文件读取
 * InitializingBean 当项目已启动，spring接口，spring加载之后，执行接口的一个方法
 * @PropertySource 使用默认只能读取properties和xml 文件，如果需要读取yml文件，需要重新配置一下
 * </p>
 */


@Component
@PropertySource(value = {"classpath:data/data.yml"}, encoding = "UTF-8", factory = YmlFactory.class)
public class ConstantPropertiesUtil implements InitializingBean {

    public static Long ID;

    public static String NAME;

    public static String PASSWORD;

    @Value("${user.id}")
    private Long id;

    @Value("${user.name}")
    private String name;

    @Value("${user.password}")
    private String password;

    @Override
    public void afterPropertiesSet() throws Exception {

        ID = id;
        NAME = name;
        PASSWORD = password;
    }


}
