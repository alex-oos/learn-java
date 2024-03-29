package com.liaoxuefeng.fAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Alex
 * @since 2020/6/8 上午 7:42
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Check {

    int min() default Integer.MIN_VALUE;

    int max() default Integer.MAX_VALUE;

    int value() default 0;

}
