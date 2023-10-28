package com.liaoxuefeng.aQuickStart.hInterface;


import com.liaoxuefeng.aQuickStart.dOverload.Hello;
import com.liaoxuefeng.aQuickStart.gAbstract.Person;

/**
 * @author Alex
 * @since 2020/5/28 15:32
 * @Descprition:
 */

public class Student implements Person, Hello {

    private final String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return this.name;
    }


  /*  @Override
    public void hello() {

    }*/

    public static void main(String[] args) {
        Student student = new Student("alex");
        String name1 = student.getName();
        System.out.println("name1 = " + name1);
    }

}
