package com.liaoxuefeng.jDate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * @author Alex
 * @since 2020/7/8 15:20
 * Java提供的System.currentTimeMillis()返回的就是以毫秒表示的当前时间戳
 * 这个当前时间戳在java.time中以Instant类型表示，我们用Instant.now()获取当前时间戳，效果和System.currentTimeMillis()类似
 */
public class InstantDemo {

    /**
     * 时间戳类 Instant 的基本应用
     */
    public static void instantUse() {

        Instant instant = Instant.now();
        System.out.println("秒 " + instant.getEpochSecond()); // 秒
        System.out.println("毫秒 " + instant.toEpochMilli()); // 毫秒
        System.out.println("时间戳： " + System.currentTimeMillis()); // 时间戳，毫秒


    }

    /**
     * 将时间秒级别的时间戳转化为时间
     * 使用方法： Instant.ofEpochSecond()
     * 将时间毫秒级别的时间戳转化为时间，使用 Instant.ofEpochMilli()
     * 转化思路：
     * 1. 先转化为 Instant 类
     * 2. instant 设置时区，转化为 ZonedDateTime
     * 3. 格式化输出 DateTimeFormatter
     *
     * @param time 传入时间戳，秒级别
     */
    public static void methods(long time) {

        Instant instant = Instant.ofEpochSecond(time);
        // Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(zonedDateTime);
        System.out.println("当前时间为： " + format);

    }

    /**
     * 计算时间差
     */
    public static void timeCalculate() {

        Instant begin = Instant.now();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant end = Instant.now();
        // 方式一：直接减
        long difference = (end.toEpochMilli() - begin.toEpochMilli()) / 1000;
        System.out.println("耗时：" + difference);
        // 方式二：使用 Duration
        Duration duration = Duration.between(begin, end);
        System.out.println("耗时：" + duration.toMillis() + "毫秒");

        // 方式三：使用内置方法
        long until = begin.until(end, ChronoUnit.MILLIS);
        System.out.println("耗时:" + until + "毫秒");
    }

    /**
     * localDateTime 与 instant 的转换
     */
    public static void transform() {
        //转化一：instant 转 localDateTime
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(localDateTime);
        //转化二：localDateTime 转 instant
        Instant instant = localDateTime.toInstant(ZoneOffset.of("+8"));
        System.out.println(instant);
    }


    public static void main(String[] args) {

        instantUse();
        //  获取到当前时间戳，毫秒级别，然后除以1000 转化为秒级别
        long time = System.currentTimeMillis() / 1000;
        methods(time);
        timeCalculate();
        transform();
    }

}
