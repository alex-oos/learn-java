package com.liaoxuefeng.jDate;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: 李将
 * @Date: 2020/6/24 17:39
 * @Descprition: 日期新的API：
 */
public class TestLocal {

    public static void main(String[] args) {
        format();
        function();
    }
    private static void format() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String format = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(format);

    }
    /**
     * localdata用法
     */
    public static void function() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

    }

}
