package com.liaoxuefeng.jDate;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Alex
 * @since 2020/6/24 17:39
 * 日期新的API：
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
        String format1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(format1);

    }

    /**
     * 用法
     */
    public static void use() {

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
    public static void transform() {
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

    /**
     * LocalDateTime 计算
     */
    public static void timeCalculate() {
        //加时间
        LocalDateTime plus = LocalDateTime.now().plus(Duration.ofDays(1));
        LocalDateTime localDateTime = LocalDateTime.now().plusHours(1);
        System.out.println(localDateTime);
        System.out.println(plus);
        //时间减
        LocalDateTime minus = LocalDateTime.now().minus(Duration.ofDays(1));
        System.out.println(minus);
        LocalDateTime localDateTime1 = LocalDateTime.now().minusHours(1);
        System.out.println(localDateTime1);
        //获取当前时间，并且将小时设置为1
        LocalDateTime with = LocalDateTime.now().with(LocalTime.of(1, 1, 1));
        System.out.println(with);
        LocalDateTime localDateTime2 = LocalDateTime.now().withHour(1);
        System.out.println(localDateTime2);
    }

    public static void main(String[] args) {

        format();
        use();
        transform();
        timeCalculate();
    }

}
