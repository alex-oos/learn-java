package com.atguigu.day13.entity;


import lombok.Data;

/**
 * @author Alex
 * @since 2021/12/16 4:01 下午
 * <P></p>
 */
@Data
public class Person {

    public String name;

    public int age;

    public int id = 1001;

    public void eat() {
        System.out.println("人：吃饭");
    }
    public void walk() {
        System.out.println("人：走路");
    }


}
