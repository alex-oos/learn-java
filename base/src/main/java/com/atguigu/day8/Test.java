package com.atguigu.day8;


import java.util.Arrays;

/**
 * @author Alex
 * @date 2021/12/8 2:36 下午
 * <P></p>
 */
public class Test {

    public static void main(String[] args) {

        new Test().function("A", "B", "C");
    }

    // 参数传递，可以传多个参数，不限制长度，其实核心就是传了一个数组而已
    public void function(String... arr) {

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }


}
