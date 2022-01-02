package com.atguigu.day11;


/**
 * @author Alex
 * @date 2021/12/13 2:56 下午
 * <P></p>
 */
public class Student extends Person{

    String major;
    public Student() {
    }
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void study(){
        System.out.println("学习");
    }

    public void show(){
        System.out.println("name:" + getName() + ",age:" + getAge());
    }

}
