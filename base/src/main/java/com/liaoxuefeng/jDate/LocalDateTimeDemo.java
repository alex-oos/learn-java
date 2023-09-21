package com.liaoxuefeng.jDate;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: 李将
 * @Date: 2020/6/24 17:39
 * @Descprition: 日期新的API：
 * LocalDate：表示一个日期，比如2020-06-24
 * LocalTime：表示一个时间，比如13:45:20
 * LocalDateTime：表示一个日期和时间，比如2020-06-24T13:45:20
 */
public class LocalDateTimeDemo {

    /**
     * 格式化 日期
     */
    private static void format() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);

    }

    /**
     * localdata用法
     */
    public static void function() {

        LocalDate localDate = LocalDate.now(); // 获取当前日期
        LocalTime localTime = LocalTime.now(); // 获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now(); // 获取当前日期和时间
        System.out.println(localDate); // 严格按照ISO 8601格式打印
        System.out.println(localTime); // 严格按照ISO 8601格式打印
        System.out.println(localDateTime); // 严格按照ISO 8601格式打印

    }

    /**
     * 日期之间的转化
     */
    public static void function1() {
        //  方式一：toLocalDate  toLocalTime
        LocalDateTime dt = LocalDateTime.now();
        LocalDate localDate = dt.toLocalDate(); // 转化成当前日期
        LocalTime localTime = dt.toLocalTime(); // 转化成 当前时间
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 方式二： 固定转换为时间
        LocalDate localDate1 = LocalDate.of(2023, 11, 1);
        LocalTime localTime1 = LocalTime.of(18, 11, 22);
        LocalDateTime localDateTime = LocalDateTime.of(2029, 1, 1, 1, 1, 1);


    }

    public static void main(String[] args) {

        format();
        function();
        function1();
    }

}
