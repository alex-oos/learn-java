package com.liaoxuefeng.day6;

import java.util.StringJoiner;

/**
 * @Auther: 李将
 * @Date: 2020/5/29 11:39
 * @Descprition:
 */
public class TestSringJoiner {

    //字符串拼接
    public static void f1() {
        String[] names = {"liuyan", "xiaoai", "xiaomi"};
        var sb = new StringBuilder();
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
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println("sj = " + sj.toString());
    }


    public static void main(String[] args) {
        f1();
        f2();
    }
}