package com.atguigu.day12oop.exer3;


/**
 * @author Alex
 * @since 2021/12/16 4:36 下午
 * <P></p>
 */
public class KidsTest {

    public static void main(String[] args) {

        Kid kid = new Kid(12);
        kid.printAge();
        kid.setSalary(0);
        kid.setSex(1);
        kid.employeed();
        kid.manOrWoman();
    }

}
