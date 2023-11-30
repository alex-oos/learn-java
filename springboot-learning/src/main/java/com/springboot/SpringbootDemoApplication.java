package com.springboot;


import com.springboot.bean.Pet;
import com.springboot.bean.User;
import com.springboot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author :Alex
 * @since :2021年6月25日19:02:25
 */

@EnableScheduling
// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan("com.atguigu.boot")
@SpringBootApplication()
public class SpringbootDemoApplication {

    public static void main(String[] args) {


        // 1、定义返回的是一个容器
        ConfigurableApplicationContext ioc = SpringApplication.run(SpringbootDemoApplication.class, args);
        //	2、 查看容器中的组件
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("容器中的组件有: " + beanDefinitionName);
        }

        int beanDefinitionCount = ioc.getBeanDefinitionCount();
        System.out.println("组件的数量是: " + beanDefinitionCount);
        //	3、从容器中获取组件
        String[] beanNamesForType = ioc.getBeanNamesForType(WebMvcAutoConfiguration.class);
        System.out.println("beanNamesForType.length = " + beanNamesForType.length);

        Pet pet01 = ioc.getBean("tom", Pet.class);
        Pet pet02 = ioc.getBean("tom", Pet.class);
        System.out.println("是否相等：" + (pet01 == pet02));
        System.out.println("组件是：" + pet01);

        // 4、com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$972470a9@ea85e17
        MyConfig bean = ioc.getBean(MyConfig.class);
        System.out.println("bean = " + bean);

        // 如果@Configuration(proxyBeanMethods =true) 代理对象调用方法，springboot总会检查这个组件是否在容器中，保存组件单实例
        User user = bean.user();
        User user1 = bean.user();
        System.out.println(user == user1);

        User user2 = ioc.getBean("user", User.class);
        Pet tom = ioc.getBean("tom", Pet.class);
        System.out.println("用户的宠物：" + (user2.getPet() == tom));

        // 5、获取组件
        String[] beanNamesForType1 = ioc.getBeanNamesForType(User.class);
        for (String s : beanNamesForType1) {
            System.out.println("s = " + s);
        }

        // DBHelper bean1 = ioc.getBean(DBHelper.class);
        // System.out.println("bean1 = " + bean1);

        // 看看spring容器中有cc组件么
        boolean cc = ioc.containsBean("cc");
        System.out.println("容器中cc组件：" + cc);

    }

}
