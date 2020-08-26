package com.liaoxuefeng.hCollection.dEnumMap;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author: 李将
 * @since: 2020/6/11 14:39
 * @Descprition: Map的key是enum类型，推荐使用EnumMap，既保证速度，也不浪费空间。
 */
public class Main {
    public static void main(String[] args) {
        Map<DayOfWeek, String> map = new EnumMap<DayOfWeek, String>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println("map = " + map);
        System.out.println("map.get(DayOfWeek.SUNDAY) = " + map.get(DayOfWeek.SUNDAY));

    }
}
