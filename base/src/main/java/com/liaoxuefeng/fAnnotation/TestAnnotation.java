package com.liaoxuefeng.fAnnotation;

/**
 * @author Alex
 * @since 2020/6/8 上午 7:21
 * @Descprition: 注解：（Annotation）
 * 注解分为三类：
 * 1、编译器使用的注解
 * ,例如：@Override：让编译器检查该方法是否正确地实现了覆写； @SuppressWarnings：告诉编译器忽略此处代码产生的警告。
 * 这类注解不会被编译进入.class文件，它们在编译后就被编译器扔掉了。
 * 2、工具处理.class文件使用的注解，，比如有些工具会在加载class的时候，对class做动态修改，实现一些特殊的功能。这类注解会被编译进入.class文件，但加载结束后并不会存在于内存中。这类注解只被一些底层库使用，一般我们不必自己处理。
 * 3、程序运行期能够读取的注解，它们在加载后一直存在于JVM中，这也是最常用的注解。例如，一个配置了@PostConstruct的方法会在调用构造方法后自动被调用（这是Java代码读取该注解实现的功能，JVM并不会识别该注解
 * <p>
 * 定义一个注解时，还可以定义配置参数。配置参数可以包括：
 * 所有基本类型；
 * String；
 * 枚举类型；
 * 基本类型、String以及枚举的数组。
 * 此外，大部分注解会有一个名为value的配置参数，对此参数赋值，可以只写常量，相当于省略了value参数。
 */
public class TestAnnotation {
/*
    @Check(min = 0, max = 100, value = 55)
    public int n;

    @Check(value = 99)*/
    public int p;

    //    @Check(99) // @Check(value=99)
    public int x;

    @Check
    public int y;


}
