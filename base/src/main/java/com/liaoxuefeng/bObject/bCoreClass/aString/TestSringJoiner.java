package com.liaoxuefeng.bObject.bCoreClass.aString;

import java.util.StringJoiner;

/**
 * @author Alex
 * @since 2020/5/29 11:39
 *
 */
public class TestSringJoiner {

    //字符串拼接
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
