package com.liaoxuefeng.rFunctional.cOptional;

import java.util.Optional;

/**
 * @author Alex
 * @since 2023/9/27 上午10:47
 *  1. Optional是一个容器对象，它包括了我们需要的对象，使用Optional我们就不用显式进行空指针检查。
 * 2.Optional类的Javadoc描述如下：这是一个可以为null的容器对象。如果值存在
 * 则isPresent()方法会返回true，调用get()方法会返回该对象
 */
public class OptionalDemo {

    /**
     * Optional 常用的一些方法
     * 一、创建Optional对象的方法
     * 1. Optional.of(T t) : 创建一个Optional实例
     * 2. Optional.empty() : 创建一个空的Optional实例
     * 3. Optional.ofNullable(T t) : 若t不为null，创建Optional实例，否则创建空实例
     */
    public static void createObject() {

        // 方式一：
        Optional<Object> o1 = Optional.of("hello");
        System.out.println("o1.isPresent() = " + o1.isPresent());
        // 方式二：
        Optional<Object> o2 = Optional.empty();
        System.out.println("o2.isPresent() = " + o2.isPresent());

        // 方式三：一般使用他，可以防止空指针异常
        Optional<String> o3 = Optional.ofNullable("hello");
        System.out.println("o1.isPresent() = " + o3.isPresent());

    }

    /**
     * optional 容器中是否包含对象
     * 1. boolean isPresent():判断是否包含对象
     * 2. void ifPresent(Consumer<? super T> consumer) 如果有值，就执行Consumer接口的实现代码，并且该值会作为参数传给它。
     */
    public static void isPresentDemo() {

        Optional<String> o1 = Optional.ofNullable("AA");
        System.out.println("o1.isPresent() = " + o1.isPresent());
        o1.ifPresent(System.out::println);
    }

    /**
     * 获取Optional容器的对象
     * T get()：如果调用对象包含值，返回该值，否则抛异常
     * T orElse(T other):如果有值则将其返回，否则返回特定的other对象
     * T orElseGet(Supplier<? extends T> other) ：如果有值则将其返回，否则返回由
     * Supplier接口实现提供的对象。
     *  T orElseThrow(Supplier<? extends X> exceptionSupplier) ：如果有值则将其返
     * 回，否则抛出由Supplier接口实现提供的异常。
     */
    public static void getOptionalObject() {

        Boy b = new Boy();
        b.setName("小明");
        Optional<Girl> opt = Optional.ofNullable(b.getGirlFriend());
        // 获取对象，如果没有抛出异常
        // Girl girl = opt.get();
        // System.out.println("girl = " + girl);
        Girl girl = opt.orElse(new Girl("王婷婷"));
        System.out.println("girl = " + girl);


    }

    public static void main(String[] args) {

        createObject();
        isPresentDemo();
        getOptionalObject();
    }

}
