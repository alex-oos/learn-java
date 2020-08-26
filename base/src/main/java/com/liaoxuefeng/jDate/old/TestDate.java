package com.liaoxuefeng.jDate.old;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: 李将
 * @Date: 2020/6/24 15:49
 * @Descprition:
 */
public class TestDate {
    public static void function() {
        Date date = new Date();
        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth() + 1);
        System.out.println(date.getDate());

        System.out.println(date);
        System.out.println(date.toLocaleString());
        System.out.println(date.toGMTString());
    }

    public static void function1() {
        Date Date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(Date));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("E MMM dd, yyyy");
        System.out.println(simpleDateFormat1.format(Date));
    }

    public static void main(String[] args) {
        function();
        function1();
    }
}
