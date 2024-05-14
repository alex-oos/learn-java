package com.atguigu.day10oop.exer;


/**
 * @author Alex
 * @since 2022/4/20 07:32
 */
public class Boy {

    private String name;

    private Integer age;

    public Boy() {

    }

    public Boy(String name, Integer age) {

        this();
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public void show() {

        System.out.println("我叫" + this.name + "，今年" + this.age + "岁");
    }

    public void marry(Girl girl) {

        System.out.println("我想娶" + girl.getName());
    }

}
