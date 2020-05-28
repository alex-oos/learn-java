package com.liaoxuefeng.day1;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 11:59
 * @Descprition:
 */
public class Main {
    public static void main(String[] args) {
        //多态
        Student student = new Student("刘言", 18, 80);
        // TODO(不懂)
        System.out.println(student.toString());

        //多态
        Person ss = new Student();
        //System.out.println(student.run(\"ssss"));

        // 向上转型
        Person p1 = new Student();
        Person p2 = new Student(); // upcasting, ok
        Person p3 = new Person();
        Student s1 = (Student) p1; // ok
        Student s2 = (Student) p2;

        //向下转型
        Person p = new Person();
        System.out.println(p instanceof Person); // true
        System.out.println(p instanceof Student); // false

        Student s = new Student();
        System.out.println(s instanceof Person); // true
        System.out.println(s instanceof Student); // true

        Student n = null;
        System.out.println(n instanceof Student); // false


//
    }

}
