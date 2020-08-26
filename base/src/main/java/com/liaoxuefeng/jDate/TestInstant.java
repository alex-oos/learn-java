package com.liaoxuefeng.jDate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author: 李将
 * @Date: 2020/7/8 15:20
 * @Descprition: Java提供的System.currentTimeMillis()返回的就是以毫秒表示的当前时间戳
 * 这个当前时间戳在java.time中以Instant类型表示，我们用Instant.now()获取当前时间戳，效果和System.currentTimeMillis()类似
 */
public class TestInstant {
    public static void function() {
        Instant instant = Instant.now();
        System.out.println("秒 " + instant.getEpochSecond()); // 秒
        System.out.println("毫秒 " + instant.toEpochMilli()); // 毫秒
        System.out.println(System.currentTimeMillis());


    }

    //    将时间秒级别的时间戳转化为时间
    public static void function1() {

        Instant instant = Instant.ofEpochSecond(1594193546);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

    }

    public static void main(String[] args) {
        function();
        function1();
    }
}
