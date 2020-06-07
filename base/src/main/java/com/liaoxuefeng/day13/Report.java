package com.liaoxuefeng.day13;

/**
 * @Auther: 李将
 * @Date: 2020/6/8 上午 7:40
 * @Descprition:
 */
public @interface Report {
    int type() default 0;

    String level() default "info";

    String value() default "";

}
