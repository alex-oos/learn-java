package com.mybatisplus.config.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName WebLog
 * @Description
 * @Author Alex
 * @Date 2024/1/21 22:36
 * @Version 1.0
 */

@Retention(RetentionPolicy.RUNTIME)//注解不仅被保存到class文件中，jvm加载class文件之后，仍存在
@Target(ElementType.METHOD) //注解添加的位置
@Documented
public @interface WebLog {

    String description() default "";

}
