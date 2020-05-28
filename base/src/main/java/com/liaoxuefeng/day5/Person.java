package com.liaoxuefeng.day5;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 15:30
 * @Descprition:
 */
/*
在抽象类中，抽象方法本质上是定义接口规范：即规定高层类的接口，从而保证所有子类都有相同的接口实现，这样，多态就能发挥出威力。

如果一个抽象类没有字段，所有方法全部都是抽象方法：就可以把该抽象类改写为接口：interface。
Java的接口特指interface的定义，表示一个接口类型和一组方法签名，而编程接口泛指接口规范，如方法签名，数据格式，网络协议等。



* */
public interface Person extends Hello {
    String getName();

    default void run() {
        System.out.println(getName() + " run");
    }

}
