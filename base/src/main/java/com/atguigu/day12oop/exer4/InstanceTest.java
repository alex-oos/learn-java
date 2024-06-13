package com.atguigu.day12oop.exer4;

import lombok.ToString;

/**
 * @author Alex
 * @since 2024/6/13 上午10:32
 * <p> 多态性的练习：主要是练习 instanceof 和 classCast</p>
 */
public class InstanceTest {

    /**
     * 练习 instanceof 和 classCast
     * @param p
     */
    public static void classCast(Person p) {
        // 取值范围从小到大
        //判断是否处于 Graduate
        if (p instanceof Graduate) {
            System.out.println("************************************");
            System.out.println("I am a Graduate");

        }
        //判断是否处于 Student
        if (p instanceof Student) {
            System.out.println("************************************");
            System.out.println("I am a student");
        }

        //判断是否是Person
        if (p instanceof Person) {
            System.out.println("************************************");
            System.out.println("I am a person");
        }

    }

    public static void main(String[] args) {

        Person student = new Student("Alex", 18, "SZU");
        classCast(student);
        Person person = new Person("Alex", 18);
        classCast(person);
        Person teacher = new Graduate("Alex", 18, "SZU", "Computer Science");
        classCast(teacher);
    }

}

@ToString
class Person {

    private String name;

    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

}

@ToString
class Student extends Person {

    private String school;

    public Student(String name, int age, String school) {

        super(name, age);
        this.school = school;
    }

}

@ToString
class Graduate extends Student {

    private String major;


    public Graduate(String name, int age, String school, String major) {

        super(name, age, school);

        this.major = major;

    }

}
