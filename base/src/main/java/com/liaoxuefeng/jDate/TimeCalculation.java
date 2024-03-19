package com.liaoxuefeng.jDate;

import java.time.Duration;
import java.time.Instant;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2024/2/27 上午11:29
 */
public class TimeCalculation {

    /**
     * 一般时间的计算主要有：Duration 类， Period 类或 ChronoUnit.between 方法。 甲持续时间测量使用基于时间的值（秒，毫微秒）的时间量。Period 使用基于日期的值（年，月，日）。
     */

    /**
     * 计算机器时间，使用duration类
     */
    public static void durationDemo() {

        Instant t1 = Instant.now();
        Instant t2 = Instant.now();
        // 计算差值，并且返回毫秒
        long millis = Duration.between(t1, t2).toMillis();
        System.out.println("耗时" + millis + "毫秒");

        // 常用的api如下：
        Instant start = Instant.now();
        // 时间计算+ 100秒
        Duration gap = Duration.ofSeconds(100);
        Duration duration = gap.plusMillis(100);
        System.out.println("耗时" + duration.toMillis() + "毫秒");

        // 100秒后
        Instant later = start.plus(gap);
        System.out.println(later.toEpochMilli());


    }

    public static void main(String[] args) {

        durationDemo();
    }

}
