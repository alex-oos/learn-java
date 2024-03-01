package com.liaoxuefeng.fAnnotation;

/**
 * @author Alex
 * @since 2020/6/8 16:50
 */
public class Person {

    @Range(min = 1, max = 20)
    public String name;

    @Range(max = 10)
    public String city;

    @Range(max = 150)
    public Integer age;


    public Person(String name, String city, Integer age) {

        this.name = name;
        this.city = city;
        this.age = age;
    }

}
