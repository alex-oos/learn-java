package com.liaoxuefeng.jDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Auther: 李将
 * @Date: 2020/6/29 17:46
 * @Descprition:
 */
//新的API
//一个带时区的日期和时间，我们就需要ZonedDateTime
public class TestZonedDateTime {
    public static void function() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
        System.out.println(zny);
    }

    //    时间转换
    public static void function1() {

//        获取中国区的时间
        ZonedDateTime zbj = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
//        获取纽约的时间
        ZonedDateTime zny = zbj.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj);
        System.out.println(zny);


    }

    //    练习：某航线从北京飞到纽约需要13小时20分钟，请根据北京起飞日期和时间计算到达纽约的当地日期和时间。
    public static void function3() {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();


    }

    public static void main(String[] args) {
        function();
        function1();
    }
}
