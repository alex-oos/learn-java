package com.liaoxuefeng.fAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Alex
 * @since 2020/6/8 上午 7:40
 * <p>
 * 手动编写注解
 * </p>
 */


/**
 * @Target。使用@Target可以定义Annotation能够被应用于源码的哪些位置： 类或接口：ElementType.TYPE；
 * 字段：ElementType.FIELD；
 * 方法：ElementType.METHOD；
 * 构造方法：ElementType.CONSTRUCTOR；
 * 方法参数：ElementType.PARAMETER。
 * @Retention定义了Annotation的生命周期： 仅编译期：RetentionPolicy.SOURCE；
 * 仅class文件：RetentionPolicy.CLASS；
 * 运行期：RetentionPolicy.RUNTIME。
 * 默认是CLASS。如果需要在运行期读取Annotation，那么必须设置Retention为RUNTIME。
 * @Repeatable 使用@Repeatable这个元注解可以定义Annotation是否可重复。这个注解应用不是特别广泛。
 * 编写注解的步骤：
 * 第一步，用@interface定义注解：
 * 第二步，添加参数、默认值：
 * 第三步，用元注解配置注解：
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Report {

    int type() default 0;

    String level() default "info";

    String value() default "";

}
