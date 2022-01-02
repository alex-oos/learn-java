package com.atguigu.day13;


import lombok.Data;

/**
 * @author Alex
 * @date 2021/12/16 4:01 下午
 * <P></p>
 */
@Data
public class Person {

    String name;

    int age;

    int id = 1001;

    public void eat() {
        System.out.println("人：吃饭");
    }
    public void walk() {
        System.out.println("人：走路");
    }


}
