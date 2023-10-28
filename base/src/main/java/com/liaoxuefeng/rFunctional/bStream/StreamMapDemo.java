package com.liaoxuefeng.rFunctional.bStream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Alex
 * @since 2023/9/26 下午5:25
 * @Descprition: Stream 中常见的映射流
 */
public class StreamMapDemo {

    /**
     * 一、 map() 介绍：
     * map() 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数： 例如：f(x) = x * x.
     * 我们将这个函数映射到一个序列，生成了一个新的序列。
     */
    public static void mapDemo() {
        // demo1 将一个list中的每个元素都变成其平方
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
        // map方法传入的是一个Function 接口对象，定义了一个apply 方法，负责把一个T类型转换成R类型
        Stream<Integer> s2 = s.map(n -> n * n);
        s2.forEach(System.out::println);

        // demo2 将其所有转化为小写，打印出来
        List.of("Apple", "pear", "Oragne", "Banna").stream() // 转换为Stream 流
                .map(String::trim) // 去空格
                .map(String::toLowerCase)//// 变小写
                .sorted() // 排序
                .forEach(System.out::println); // 打印出来

        // demo3 请使用map把String[]转换为LocalDate并打印:
        String[] array = new String[]{" 2019-12-31 ", "2020 - 01-09 ", "2020- 05 - 01 ", "2022 - 02 - 01", " 2025-01 -01"};
        Arrays.stream(array).map(s3 -> s3.replaceAll("\\s*", "")).map(LocalDate::parse).forEach(System.out::println);

    }

    /**
     * 二、mapToDouble()
     * 接收一个函数作为参数，该函数会被应用到每个元
     * 素上，产生一个新的 DoubleStream
     */
    public static void mapToDoubleDemo() {

        Stream<String> s1 = Stream.of("1", "2", "3", "4");
        s1.mapToDouble(Double::parseDouble).forEach(System.out::println);

    }

    /**
     * 三、 mapToInt(ToIntFunction f)
     * 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的 IntStream。
     */
    public static void mapToIntDemo() {
        // 生成的流是无限流，一定要记得limit 一下，不然就死循环了
        Stream<String> s1 = Stream.generate(new Supplier<String>() {
            int n = 0;

            @Override
            public String get() {

                n++;
                return String.valueOf(n);
            }
        });
        s1.limit(20).mapToInt(Integer::parseInt).forEach(System.out::println);

    }

    /**
     * mapToLong(ToLongFunction f)接收一个函数作为参数，该函数会被应用到每个元
     * 素上，产生一个新的 LongStream。
     */
    public static void mapToLongDemo() {

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);
        s1.mapToLong(Long::valueOf).forEach(System.out::println);


    }

    public static void main(String[] args) {

        mapDemo();
        mapToDoubleDemo();
        mapToIntDemo();
        mapToLongDemo();
    }


}
