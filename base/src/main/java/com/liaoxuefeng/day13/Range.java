package com.liaoxuefeng.day13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: 李将
 * @Date: 2020/6/8 16:51
 * @Descprition:
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Range {

    int min() default 0;

    int max() default 256;

}
