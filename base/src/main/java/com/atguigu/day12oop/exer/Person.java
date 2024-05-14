package com.atguigu.day12oop.exer;


/**
 * @author Alex
 * @since 2021/12/13 3:58 下午
 * <P></p>
 */
public class Person {

    String name;

    int age;

    int id = 1001;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println("人：吃饭");
    }
    public void walk() {
        System.out.println("人：走路");
    }


}
