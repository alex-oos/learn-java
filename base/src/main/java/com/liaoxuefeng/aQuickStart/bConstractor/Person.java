package com.liaoxuefeng.aQuickStart.bConstractor;

/**
 * @Auther: 李将
 * @Date: 2020/5/27 17:30
 * @Descprition:父类，主要是学习构造方法，构造器，set，get方法，重写
 */
public class Person {
    protected String name;
    protected int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void run() {

        System.out.println("run方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
