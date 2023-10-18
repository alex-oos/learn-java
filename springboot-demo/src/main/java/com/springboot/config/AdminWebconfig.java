package com.springboot.config;


import com.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Alex
 * @since 2021/8/27 9:08 下午
 * <P></p>
 */


@Configuration
public class AdminWebconfig implements WebMvcConfigurer {

    /**
     * 拦截器，拦截所有请求，也可以拦截指定请求，多用于登录拦截，是否鉴权
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/swagger**/**")
                .excludePathPatterns("/webjars/**")
                .excludePathPatterns("/v3/**")
                .excludePathPatterns("/doc.html");
    }

    /**
     * 静态资源拦截
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
    }


    /**
     * 解决全局跨域，
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 添加映射路径
        registry.addMapping("/**")
                // 放行哪些原始域
                .allowedOriginPatterns("*")
                // 是否发送Cookie信息
                .allowCredentials(true)
                // 放行哪些原始域(请求方式)
                .allowedMethods("*")
                // 放行哪些原始域(头部信息)
                .allowedHeaders("*")
                // 暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
                .exposedHeaders("access-control-allow-headers",
                        "access-control-allow-methods",
                        "access-control-allow-origin",
                        "access-control-max-age",
                        "X-Frame-Options");
    }

}
