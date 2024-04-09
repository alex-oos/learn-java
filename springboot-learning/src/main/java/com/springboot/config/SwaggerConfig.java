package com.springboot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <P></p>
 * <p>
 * knife4j 访问地址：http://localhost:8080/doc.html#/home
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 *
 * @version 1.0
 * @since 2021/8/27
 */
@Configuration
@EnableOpenApi
@Profile(value = {"dev", "test"})   // 生产环境默认不开启
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {

        return new Docket(
            // 设置使用 OpenApi 3.0 规范
            DocumentationType.OAS_30)
            // 是否激活
            .enable(true)
            // 配置项目基本信息
            .apiInfo(apiInfo())
            // 选择那些路径和api会生成document
            .select()
            // 对所有api进行监控
            .apis(RequestHandlerSelectors.any())
            // .apis(RequestHandlerSelectors.withMethodAnnotation(Operation.class))
            // 如果需要指定对某个包的接口进行监控，则可以配置如下
            //.apis(RequestHandlerSelectors.basePackage("mydlq.swagger.example.controller"))
            // 对所有路径进行监控
            .paths(PathSelectors.any())
            // 忽略以"/error"开头的路径,可以防止显示如404错误接口
            .paths(PathSelectors.regex("/error.*").negate())
            // 忽略以"/actuator"开头的路径
            // .paths(PathSelectors.regex("/actuator.*").negate())
            .build();
    }

    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
            // 文档标题
            .title("工具服务接口文档")
            // 文档描述
            .description("文档描述")
            // 设置管理该API人员的联系信息
            .contact(new Contact("Alex", "Alex.com", "alex.li@paytm.com"))
            // 文档版本
            .version("1.0")
            .build();
    }

}
