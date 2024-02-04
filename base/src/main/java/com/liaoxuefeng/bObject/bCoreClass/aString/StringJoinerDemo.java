package com.liaoxuefeng.bObject.bCoreClass.aString;

import java.util.StringJoiner;

/**
 * @author Alex
 * @since 2020/5/29 11:39
 *  StringJoiner 字符串拼接用法
 */
public class StringJoinerDemo {

    // 字符串拼接,使用StringBuilder手动拼接
    // 使用StringBuilder手动拼接字符串时，还需要考虑最后的分隔符，以及如何去除最后的分隔符。
    public static void f1() {
        String[] names = {"liuyan", "xiaoai", "xiaomi"};
        StringBuilder sb = new StringBuilder();
        sb.append("hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println("sb = " + sb);

    }

    // StringJoiner 进行字符串拼接
    // StringJoiner内部使用StringBuilder来拼接字符串，它提供了一系列重载的add()方法，允许我们指定拼接的分隔符、前缀和后缀：
    // StringJoiner joiner = new StringJoiner(", ", "Hello ", "!");
    public static void f2() {

        String[] names = {"liuyan", "xiaoai", "xiaomi"};
        StringJoiner sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println("sj = " + sj);
    }


    public static void main(String[] args) {
        f1();
        f2();
    }
}
