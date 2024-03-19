package com.liaoxuefeng.jDate;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Alex
 * @since 2020/7/8 15:06
 *  用旧的Date对象时，我们用SimpleDateFormat进行格式化显示。使用新的LocalDateTime或ZonedLocalDateTime时，我们要进行格式化显示，就要使用DateTimeFormatter。
 * 使用的时候，只能在方法内部创建新的局部变量。而DateTimeFormatter可以只创建一个实例，到处引用
 */
public class DateTimeFormatterDemo {

    // DateTimeFormatters实例化的两种方法
    public static void function() {

        // 方法一：创建DateTimeFormatter时，我们仍然通过传入格式化字符串实现：
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 方法二：另一种创建DateTimeFormatter的方法是，传入格式化字符串时，同时指定Locale：
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("E,yyyy-MM-dd HH:mm:ss", Locale.CHINA);

    }

    //
    public static void function1() {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'T' HH:mm ZZZZ");
        System.out.println(formatter.format(zonedDateTime));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy MM dd EE  HH:mm ", Locale.CHINA);
        System.out.println(formatter1.format(zonedDateTime));
        // 按照美国习惯，输出日期和时间：
        DateTimeFormatter formater2 = DateTimeFormatter.ofPattern("E, MMMM/dd/yyyy HH:mm", Locale.US);
        System.out.println(formater2.format(ZonedDateTime.now(Clock.system(ZoneId.of("America/New_York")))));

    }

    public static void main(String[] args) {

        function1();
    }

}
