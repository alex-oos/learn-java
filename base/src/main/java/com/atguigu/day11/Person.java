package com.atguigu.day11;


/**
 * @author Alex
 * @since 2021/12/13 2:56 下午
 * <P></p>
 */
public class Person extends Creature {

    String name;

    private int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println("吃饭");
        sleep();
    }
    public void sleep() {
        System.out.println("睡觉");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
