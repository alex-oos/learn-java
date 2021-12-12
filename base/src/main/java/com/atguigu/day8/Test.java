package com.atguigu.day8;


import java.util.Arrays;

/**
 * @author Alex
 * @date 2021/12/8 2:36 下午
 * <P></p>
 */
public class Test {

    public void function(String... arr) {
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        new Test().function("A", "B", "C");
    }


}
