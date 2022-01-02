package com.atguigu.day13;


/**
 * @author Alex
 * @date 2021/12/16 4:02 下午
 * <P></p>
 */
public class Man extends Person {

    boolean isSmoking;

    int id = 1002;
    static void earnMoney() {
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
