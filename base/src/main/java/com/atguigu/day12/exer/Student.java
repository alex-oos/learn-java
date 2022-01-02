package com.atguigu.day12.exer;


/**
 * @author Alex
 * @date 2021/12/13 4:02 下午
 * <P></p>
 */
public class Student extends Person {

    String major;

    int id = 1002;
    public Student() {
    }
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生：多吃有营养的食物");
    }


    public void study() {
        System.out.println("学生：学习知识");
        this.eat();
        super.eat();
        walk();
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age);
        System.out.println("id = " + this.id);
        System.out.println("id = " + super.id);
    }

}

