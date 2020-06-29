package com.liaoxuefeng.jDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther: 李将
 * @Date: 2020/6/24 17:39
 * @Descprition:
 */
public class TestLocal {
    public static void function() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

    }

    public static void function1() {

    }

    public static void main(String[] args) {
        function();
    }
}
