package com.liaoxuefeng.rFunctional.bStream;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Alex
 * @since 2023/9/26 下午5:51
 * @Descprition:
 */
public class StreamFilterDemo {

    /**
     * Stream  filter() 介绍：
     * filter() 方法用于通过设置的条件过滤出元素
     * filter()方法传入的是 Predicate 接口对象，对象中的test方法，负责判断元素是否符合条件
     * filter()除了常用于数值外，也可应用于任何Java对象
     */
    public static void function() {
        // demo1 ，判断元素是否是奇数
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        s.filter(n -> n % 2 != 0).forEach(System.out::println);

        // demo2，从一组LocalDate 中过滤掉工作日，得到休息日
        // stream 流生成无限流序列
        Stream.generate(new Supplier<LocalDate>() {
            final LocalDate localDate = LocalDate.now();

            int n = -1;

            @Override
            public LocalDate get() {

                n++;
                return localDate.plusDays(n);
            }
        }).limit(31).filter(ldt -> ldt.getDayOfWeek() == DayOfWeek.SATURDAY || ldt.getDayOfWeek() == DayOfWeek.SUNDAY).forEach(System.out::println);

        // demo3 用filter()过滤出成绩及格的同学，并打印出名字。

        Arrays.asList(new Student("小明", 60), new Student("小雪", 80), new Student("小美", 50))
                .stream()
                .filter(s1 -> s1.getGrades() >= 60)
                .forEach(s3 -> System.out.println(s3.getName()));

    }

    public static void main(String[] args) {

        function();
    }

}
