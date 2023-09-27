package com.liaoxuefeng.rFunctional.bStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @ClassName StreamOther
 * @Description
 * @Author Alex
 * @Date 2023/9/26 21:15
 * @Version 1.0
 */
public class StreamOther {

    /**
     * limit 方法 用于获取指定数量的流，以下代码片段使用 limit 方法打印出 10 条数据：
     */
    public static void limitDemo() {

        Random r = new Random();
        r.ints().limit(10).forEach(System.out::println);
        List.of("A", "B", "C", "D", "E", "F")
                .stream()
                .skip(2) // 跳过 A,B
                .limit(3) // 截取 C,D,E
                .collect(Collectors.toList()) // 转化成list
                .forEach(System.out::println);

    }

    /**
     * sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
     */
    public static void sortedDemo() {

        Random r = new Random();
        r.ints().limit(10).sorted().forEach(System.out::println);

    }

    /**
     * Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串：
     * Collectors.toList() 转换为list
     * Collectors.toSet() 转换为Set
     * Collectors.joining(", ") 使用逗号相连
     * Collectors.toMap()  转换为map
     * Collectors.groupingBy（） 分组功能,它需要提供两个函数：一个是分组的key，这里使用s -> s.substring(0, 1)，表示只要首字母相同的String分到一组，第二个是分组的value，这里直接使用Collectors.toList()，表示输出为List，
     */
    public static void collectorsDemo() {
        // 转换为list
        Stream<String> stream = Stream.of("Apple", "", null, "Pear", "  ", "Orange");
        List<String> list = stream.filter(s -> s != null && !s.isBlank()).collect(Collectors.toList());
        System.out.println(list);

        // 转化为set
        Stream<String> stream1 = Stream.of("Apple", "", null, "Pear", "  ", "Orange");
        stream1.collect(Collectors.toSet()).forEach(System.out::println);

        // 转化为map
        Stream<String> stream2 = Stream.of("APP:Apple", "MST:Microsoft");
        Map<String, String> map = stream2.collect(Collectors.toMap(s -> s.substring(0, s.indexOf(":")), s -> s.substring(s.indexOf(":") + 1)));
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        // 转化为 group by
        List<String> list1 = List.of("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String, List<String>> groups = list1.stream().collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.toList()));
        System.out.println(groups);

    }

    /**
     * distinct() 去重
     */
    public static void distinctDemo() {

        List.of("A", "B", "C", "D")
                .stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    /**
     * Stream 流合并 concat()
     */
    public static void concatDemo() {

        Stream<String> s1 = List.of("A", "B", "C").stream();
        Stream<String> s2 = List.of("D", "E").stream();
        Stream<String> s = Stream.concat(s1, s2);
        System.out.println(s.collect(Collectors.toList()));

    }

    /**
     * flastMap() 方法 用于将多个Stream连接成一个Stream
     */
    public static void flatMapDemo() {

        Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6))
                .flatMap(list -> list.stream())
                .forEach(System.out::println);

    }

    /**
     * 并行：  s.parallel()  串行： s.sequential()
     */
    public static void parallelDemo() {

        Stream<String> s = List.of("A", "B", "C", "D").stream();
        List<String> list = s.parallel() // 变成一个可以并行处理的Stream
                .sorted() // 可以进行并行排序
                .collect(Collectors.toList());
        System.out.println("list = " + list);
    }

    /**
     * 其他方法
     * count() 计数
     * sum() 求和
     * max() 求最大值
     * min() 求最小值
     * average() 求平均值
     */

    public static void other() {

        long count = Stream.of("A", "B", "C", "D")
                .count();
        System.out.println(count);

        int sum = IntStream.of(1, 2, 3, 4)
                .sum();
        System.out.println("sum = " + sum);

        IntStream.of(1, 2, 3, 4)
                .max()
                .ifPresent(System.out::println);

        IntStream.of(1, 2, 3, 4)
                .min()
                .ifPresent(System.out::println);

        IntStream.of(1, 2, 3, 4)
                .average()
                .ifPresent(System.out::println);

        // 统计
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }


    public static void main(String[] args) {

        limitDemo();
        sortedDemo();
        collectorsDemo();
        distinctDemo();
        concatDemo();
        flatMapDemo();
        parallelDemo();
        other();
    }

}
