package com.liaoxuefeng.jDate;

import java.time.*;
import java.util.concurrent.TimeUnit;

/**
 * <P>
 * 一般时间的计算主要有：Duration 类， Period 类或 ChronoUnit.between 方法。 甲持续时间测量使用基于时间的值（秒，毫微秒）的时间量。Period 使用基于日期的值（年，月，日）。
 * </p>
 *
 * @author Alex
 * @since 2024/2/27 上午11:29
 */
public class TimeCalculation {


    /**
     * Duration类表示秒或纳秒时间间隔，适合处理较短的时间，需要更高的精确性。我们能使用between()方法比较两个瞬间的差
     *
     */
    public static void durationDemo() {

        Instant t1 = Instant.now();
        Instant t2 = Instant.now();
        // 计算差值，并且返回毫秒  between 可以传 LocalDateTime,instant 这两个值
        Duration duration = Duration.between(LocalDateTime.of(2021,1,1,0,0,0), LocalDateTime.now());
        System.out.println("耗时" + duration.toNanos() + "纳秒");
        System.out.println("耗时" + duration.toMillis() + "毫秒");
        System.out.println("耗时" + duration.toSeconds() + "秒");
        System.out.println("耗时" + duration.toMinutes() + "分钟");
        System.out.println("耗时" + duration.toHours() + "小时");
        System.out.println("耗时" + duration.toDays() + "天");

        //     时间计算
        //    时间增加
        Duration duration1 = duration.plusDays(1);
        System.out.println(duration1.toMillis());
        Duration duration2 = duration.plusHours(1);
        System.out.println(duration2.toMillis());

        Duration duration3 = duration.plusMinutes(1);
        System.out.println(duration3.toMillis());

        Duration duration4 = duration.plusSeconds(1);
        System.out.println(duration4.toMillis());

        Duration duration5 = duration.plusNanos(1);
        System.out.println(duration5.toMillis());

        //    时间减少
        Duration duration6 = duration.minusDays(1);
        System.out.println(duration6.toMillis());

        Duration duration7 = duration.minusHours(1);
        System.out.println(duration7.toMillis());

        Duration duration8 = duration.minusMillis(1);
        System.out.println(duration8.toMillis());

        Duration duration9 = duration.minusSeconds(1);
        System.out.println(duration9.toMillis());

        Duration duration10 = duration.minusNanos(1);
        System.out.println(duration10.toMillis());


    }

    /**
     * Period 类表示一段时间的年、月、日，开使用between()方法获取两个日期之间的差作为Period 对象返回：
     */
    public static void periodDemo() {

        LocalDate startDate = LocalDate.of(2015, 2, 20);
        LocalDate endDate = LocalDate.of(2017, 1, 15);
        //计算时间差值
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "天");
        //    Period类型对象是基于年、月、日和周
        Period fromUnits = Period.of(3, 10, 10);

    }

    public static void main(String[] args) {

        durationDemo();
        periodDemo();
    }

}
