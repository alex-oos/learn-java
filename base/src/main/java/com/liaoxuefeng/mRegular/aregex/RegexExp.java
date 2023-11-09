package com.liaoxuefeng.mRegular.aregex;

/**
 * @author Alex
 * @since 2023/9/8 上午10:51
 *  正则表达式：练习题
 */
public class RegexExp {

    /**
     * 下面是一个demo：匹配 20xx 年份 数字为4位
     * \\ 代表转义字符表示\     \d 代表任意一个数字
     */
    public static void f1() {

        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex));
        System.out.println("2100".matches(regex));
        System.out.println("20001".matches(regex)); // 匹配的的是前面的4位数字，多一位所以也会报错，匹配不到

    }

    /**
     * 使用正则匹配一个字符串是否是0-1的数字
     */
    public static void f2() {

        String regex = "[0-1]";
        System.out.println("1".matches(regex));
    }

    /**
     * 使用正则匹配一个字符串是否是正整数，字符串中可能含有特殊字符
     */
    public static void f3() {

        String regex = "^[1-9]\\d*$";
        boolean matches = "1233".matches(regex);
        System.out.println("正整数的匹配结果为： = " + matches);
    }

    public static void main(String[] args) {

        f1();
        f2();
        f3();
    }

}
