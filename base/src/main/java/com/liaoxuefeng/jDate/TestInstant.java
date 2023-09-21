package com.liaoxuefeng.jDate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

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
        System.out.println("时间戳： " + System.currentTimeMillis()); // 时间戳，毫秒


    }

    // 将时间秒级别的时间戳转化为时间
    public static void function1() {

        Instant instant = Instant.ofEpochSecond(1594193546);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(zonedDateTime);
        System.out.println("format = " + format);

    }

    public static void main(String[] args) {

        function();
        function1();
    }

}
