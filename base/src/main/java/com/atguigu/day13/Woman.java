package com.atguigu.day13;


/**
 * @author Alex
 * @date 2021/12/16 4:02 下午
 * <P></p>
 */
public class Woman extends Person {

    public void goShopping() {
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat() {
        System.out.println("女人少吃，为了减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人窈窕的走路");
    }

}
