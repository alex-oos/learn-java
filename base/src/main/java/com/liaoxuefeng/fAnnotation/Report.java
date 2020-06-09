package com.liaoxuefeng.fAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 李将
 * @Date: 2020/6/8 上午 7:40
 * @Descprition:
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Report {
    int type() default 0;

    String level() default "info";

    String value() default "";

}
