package com.atguigu.day10.exer;


/**
 * @author Alex
 * @date 2022/4/20 07:41
 */
public class ThisExertTest {

    public static void main(String[] args) {
        Boy boy = new Boy("梁山伯", 20);
        boy.show();
        Girl girl = new Girl("祝英台", 19);
        girl.marry(boy);

        Girl girl1 = new Girl("小雪", 20);
        Integer compare = girl.compare(girl1);
        if (compare > 0) {
            System.out.println(girl.getAge() + "：年龄大");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "：年龄大");
        } else {
            System.out.println(girl.getName() + "和" + girl1.getName() + "：一样大");

        }
    }

}
