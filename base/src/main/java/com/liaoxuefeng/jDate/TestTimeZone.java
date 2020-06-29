package com.liaoxuefeng.jDate;

import java.util.TimeZone;

/**
 * @Auther: 李将
 * @Date: 2020/6/24 16:32
 * @Descprition:
 */
public class TestTimeZone {
    public static void function() {
        TimeZone tzDefault = TimeZone.getDefault();
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00"); // GMT+9:00时区
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York"); // 纽约时区
        System.out.println(tzDefault.getID()); // Asia/Shanghai
        System.out.println(tzGMT9.getID()); // GMT+09:00
        System.out.println(tzNY.getID()); // America/New_York
    }

    public static void main(String[] args) {
        function();
    }
}

