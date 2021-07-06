package com.interview.base.day1;


/**
 * @author: TangKaiZe
 * @since: 2021/7/6 下午 9:41
 * <p>
 * 查找字符串最后一次出现的位置
 * </p>
 */
public class TestSlectString {

    public static String function(String strA, String strB) {

        int i = strA.lastIndexOf(strB);
        if (i == -1) {
            return "没有找见字符串" + strB;
        } else {
            return "字符串" + strB + "出现的位置是：" + i;
        }

    }

    public static void main(String[] args) {

        String strA = "I love you";
        String strB = "you";
        String result = function(strA, strB);
        System.out.println("result = " + result);
    }

}
