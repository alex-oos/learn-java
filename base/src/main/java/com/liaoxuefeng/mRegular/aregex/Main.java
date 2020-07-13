package com.liaoxuefeng.mRegular.aregex;

/**
 * @Auther: 李将
 * @Date: 2020/7/13 11:43
 * @Descprition:
 */
public class Main {
    /*
    * 精确匹配 ：
    *  最通用的是：
    * 1、STring.matches()
    * 2、String。Subtring
    * * 我们用^表示开头，$表示结尾。例如，^A\d{3}$，可以匹配"A001"、"A380"。
*
* 正则表达式	规则	可以匹配
^	开头	字符串开头
$	结尾	字符串结束
[ABC]	[…]内任意字符	A，B，C
[A-F0-9xy]	指定范围的字符	A，……，F，0，……，9，x，y
[^A-F]	指定范围外的任意字符	非A~F
AB|CD|EF	AB或CD或EF	AB，CD，EF
* */

    public static void main(String[] args) {
        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex));
        System.out.println("2100".matches(regex));

        String re2 = "a\\&c"; // 对应的正则是a\&c
        System.out.println("a&c".matches(re2));
        System.out.println("a-c".matches(re2));
        System.out.println("a&&c".matches(re2));

        String regex1 = "java|php";
        System.out.println("java".matches(regex1));
        System.out.println("php".matches(regex1));
        System.out.println("go".matches(regex1));

        String re = "learn\\s(java|php|go)";
        System.out.println("learn java".matches(re));
        System.out.println("learn Java".matches(re));
        System.out.println("learn php".matches(re));
        System.out.println("learn Go".matches(re));
    }
}
