package com.atguigu.day8oop.exer;


/**
 * @author Alex
 * @since 2021/12/8 3:25 下午
 * 要求：
 * (1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，
 * 输出字符串“studying”，调用showAge()方法显示age值，
 * 调用addAge()方法给对象的age属性值增加2岁。
 * (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class Person {

    String name;

    int age;

    int sex;

    public void study() {
        System.out.println("study");
    }
    public void showAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "hello";
        p.age = 1;
        p.sex = 1;
        p.study();
        p.showAge();
        Person p1 = new Person();
        p1.name = "hello";
        p1.age = 1;
        p1.sex = 1;
        p1.study();
        p1.showAge();

    }


}
