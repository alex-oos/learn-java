package com.liaoxuefeng.jDate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: 李将
 * @Date: 2020/6/29 17:46
 * @Descprition: LocalDateTime ：表示本地日期和时间
 * ZonedDateTime： 表示 一个带时区的日期和时间
 */
public class ZonedDateTimeDemo {

    /**
     * ZonedDateTime的简单使用
     * ZoneId.of("America/New_York") 指定时区
     */
    public static void function() {

        ZonedDateTime zbj = ZonedDateTime.now();  // 默认时区,默认时当前时间的时区
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
        System.out.println(zbj);
        System.out.println(zny);
    }

    /**
     * ZonedDateTime 与LocalDateTime 之间转化
     * LocalDateTime 转化为ZonedDateTime 使用的是 atZone，然后在里面指定时区
     */
    public static void function1() {

        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zbj = ldt.atZone(ZoneId.systemDefault());
        ZonedDateTime zny = ldt.atZone(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny);

        ZonedDateTime zbj1 = ZonedDateTime.now();
        System.out.println(zbj1);
        LocalDateTime ldt1 = zbj1.toLocalDateTime();
        System.out.println(ldt1);
    }

    // 时区转换
    public static void function2() {

        // 获取中国区的时间
        ZonedDateTime zbj = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        // 获取纽约的时间
        ZonedDateTime zny = zbj.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny);


    }

    // 练习：某航线从北京飞到纽约需要13小时20分钟，请根据北京起飞日期和时间计算到达纽约的当地日期和时间。

    /**
     * 思路： 北京时间 当前时间
     * 当前的纽约时间 使用 atZone 获取到纽约时间
     * 然后纽约时间+13小时20分钟，即可 使用 plusMinutes（）  plusHours（） 进行计算即可
     */
    public static void function3() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        ZonedDateTime bjTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("飞机起飞前：北京时间为:" + bjTime.format(dateTimeFormatter));
        ZonedDateTime nyTime = bjTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("飞机起飞前：纽约时间为：" + nyTime.format(dateTimeFormatter));

        int hour = 13;
        int minutes = 20;
        ZonedDateTime nyTime1 = nyTime.plusHours(hour);
        ZonedDateTime nyTime2 = nyTime1.plusMinutes(minutes);
        System.out.println("飞机落地时纽约时间为：" + nyTime2.format(dateTimeFormatter));


    }

    public static void main(String[] args) {

        function();
        function1();
        function2();
        function3();
    }

}
