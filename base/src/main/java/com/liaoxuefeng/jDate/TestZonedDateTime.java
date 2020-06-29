package com.liaoxuefeng.jDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Auther: 李将
 * @Date: 2020/6/29 17:46
 * @Descprition:
 */
//一个带时区的日期和时间，我们就需要ZonedDateTime
public class TestZonedDateTime {
    public static void function() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
        System.out.println(zny
        );
    }

    public static void main(String[] args) {
        function();
    }
}
