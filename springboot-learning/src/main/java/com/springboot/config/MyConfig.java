package com.springboot.config;


import com.springboot.bean.Pet;
import com.springboot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Alex
 * @since 2021/8/3 9:20 下午
 * <P>
 * 1、配置类 里面使用@bean 标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是一个组件
 * 3、proxyBeanMethods：代理Bean方法
 * Full（proxyBeanMethods =true） 默认是Full模式
 * Lite（proxyBeanMethods =false）
 * 来解决组件依赖的问题
 * 如果没有任何依赖问题，可以使用lite级别，如果有依赖，建议使用Full级别
 * 4、 @Import({User.class, DBHelper.class})
 * 给容器中自动创建这两个类型的组件，默认组件的名字就是类全名
 * </p>
 */
@Import({User.class})
@Configuration(proxyBeanMethods = true)  // 告诉Springboot 这是一个配置类
// @ConditionalOnBean(name = "tom")  // 条件装配：满足ConditionalOnBean 才进行条件装配
@ConditionalOnMissingBean(name = "cc")
// @EnableConfigurationProperties(Car.class)
// 1、开启Car配置绑定功能
// 2、把这个Car这个组件自动注册到容器中
public class MyConfig {

    /**
     * @return
     * @bean 的意思是给容器中添加组件，以方法名作为组件的id，返回类型就是组件类型，返回的值就是组件在容器中的实例,组件的名称默认是方法名，也可以自定义名称，比如叫做Tom，在组件后写入你的想要的名称即可
     */
    @Bean
    public User user() {

        User user = new User("张三", 18);
        // user中的组件依赖于pet组件
        user.setPet(pet());
        return user;
    }

    @Bean("tom")
    public Pet pet() {

        return new Pet("pet", 2);
    }

}
