package com.atguigu.day12oop.exer;


/**
 * @author Alex
 * @since 2021/12/13 4:02 下午
 * <P></p>
 */
public class Student extends Person {

    private String major;

    private Integer id = 1002;

    public Student() {

    }

    public Student(String name, String major) {
        //super 调用构造函数必须写在构造函数第一行
        super(name);
        this.major = major;
    }

    public Student(String name, int age, String major) {
          //super 调用构造函数必须写在构造函数第一行
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
