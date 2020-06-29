package com.liaoxuefeng.jDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Auther: 李将
 * @Date: 2020/6/24 15:59
 * @Descprition:
 */
public class TestCalendar {
    public static void function() {

        Calendar c = Calendar.getInstance();


        int y = c.get(Calendar.YEAR);
        int m = 1 + c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int w = c.get(Calendar.DAY_OF_WEEK);
        int hh = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int ms = c.get(Calendar.MILLISECOND);
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm + ":" + ss + "." + ms+"ms");

    }

    public static void function1() {
        Calendar c = Calendar.getInstance();
        c.clear();
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, 6);
        c.set(Calendar.DATE, 24);
        c.set(Calendar.HOUR_OF_DAY, 16);
        c.set(Calendar.MINUTE, 26);
        c.set(Calendar.SECOND, 50);

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));

    }
    public static void main(String[] args) {
        function();
        function1();
    }
}
