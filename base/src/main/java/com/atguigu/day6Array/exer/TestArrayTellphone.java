package com.atguigu.day6Array.exer;


/**
 * @author Alex
 * @since 2021/11/19 4:06 下午
 * <P>
 *     手机号码</p>
 */
public class TestArrayTellphone {


    public static void main(String[] args) {
        int[] arr = new int[] { 8, 2, 1, 0, 3 };
        int[] index = new int[] { 2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3 };
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);//18...

    }
}
