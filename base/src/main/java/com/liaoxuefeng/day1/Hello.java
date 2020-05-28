package com.liaoxuefeng.day1;

/**
 * @Auther: 李将
 * @Date: 2020/5/27 17:37
 * @Descprition:注意：方法重载的返回值类型通常都是相同的，方法重载的目的是，功能类似的方法使用同一名字，更容易记住，因此，调用起来更简单
 */
/*。*/

public class Hello {
    public void hello() {
        System.out.println("Hello, world!");
    }

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void hello(String name, int age) {
        if (age < 18) {
            System.out.println("Hi, " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }

}
