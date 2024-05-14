package com.atguigu.day13.entity;


/**
 * @author Alex
 * @since 2021/12/16 4:02 下午
 * <P></p>
 */
public class Man extends Person {

    public boolean isSmoking;

    int id = 1002;

    public static void earnMoney() {

        System.out.println("男人负责挣钱养家");

    }

    @Override
    public void eat() {

        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk() {

        System.out.println("男人霸气的走路");
    }


}
