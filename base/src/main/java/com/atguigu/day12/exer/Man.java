package com.atguigu.day12.exer;


/**
 * @author Alex
 * @date 2021/12/13 4:16 下午
 * <P></p>
 */
public class Man  extends  Person{

    boolean isSmoking;

    int id = 1002;


    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    @Override
    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人霸气的走路");
    }

}
