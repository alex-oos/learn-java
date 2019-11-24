package com.atguigu.day1;

import static java.lang.Math.PI;

/**
 * @Auther: 唐凯泽
 * @Date: 2019/11/24
 * @Descprition: 标识符：
 * java 对各种变量、方法和类等要素命名的时候使用的字符串叫做标识符
 * 比如：类名、变量名、包、常量名.....
 * 一、标识符命名的规则
 * 1、JAVA的标识符只能用26个英文字母（大小写）、0 -9 的数字、美元符号、下划线（_）
 * 2、数字不能开头
 * 3、不能包含空格
 * 4、严格区分大小写
 * 5、不能使用JAVA的关键字和保留字、特殊键
 * 二、标识符命名规范
 * 1、类名、接口名等：每一个单词首字母大写、形式XxxxYxx
 * 2、变量名、方法名：第一个单词字母小写，第二个单词首字母大写：形式xxxYyy
 * 3、包名：全部小写，形式 xxx .yyy.zzz  例如： java.long
 * 4、常量名：全部大写,形式：XXX_YYY_ZZZ   例如：PI
 * 总则： 见名知意
 */
public class BiaoShiFu {

    public static void main(String[] args) {
        System.out.println("类名：ClassName");
        System.out.println("包名：com.atguigu.com");
        System.out.println("常量名：" + PI);

    }


}
