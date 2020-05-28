package com.liaoxuefeng.day3;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 14:29
 * @Descprition: 因为抽象类本身被设计成只能用于被继承，因此，抽象类可以强迫子类实现其定义的抽象方法，否则编译会报错。因此，抽象方法实际上相当于定义了“规范”。
 */
public class Student extends Person {

    @Override
    public void run() {
        System.out.println("Student.run");
    }
}
