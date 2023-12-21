package com.liaoxuefeng.rFunctional.bStream.other;

import java.util.function.LongSupplier;
import java.util.stream.LongStream;

/**
 * @ClassName LongStreamDemo
 * @Description
 * @Author Alex
 * @Version 1.0
 * @since 2023/9/26 22:32
 */
public class LongStreamDemo {

    public static void createLongStream() {
        // 创建longStream 流的三种方式
        // 方式一
        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
        longStream.forEach(System.out::print);
        System.out.println();
        // 方式二： 生成0到10的数  左闭右闭 【0，10】
        LongStream.rangeClosed(0, 10).forEach(System.out::print);
        System.out.println();
        // 方式三：生成0到10的数  左闭右开 【0，9】
        LongStream.range(0, 10).forEach(System.out::print);
        System.out.println();
        // 方式四：
        LongStream.generate(new LongSupplier() {
            long i = 0;

            @Override
            public long getAsLong() {

                i++;
                return i;
            }
        }).limit(10).forEach(System.out::print);

    }

    /**
     * LongStream的常用方法如下：
     * <p>
     * count()：返回元素个数；
     * average()：返回元素平均值；
     * max()：返回最大值；
     * min()：返回最小值；
     * sum()：返回总和。
     * distinct()：去除重复元素；
     * limit(n)：只保留前n个元素；
     * skip(n)：跳过前n个元素；
     * mapToXxx(ToXxxFunction)：把每个元素都通过mapToXxxFunction转换为另一个流；
     * mapToObj(ToObjFunction)：把每个元素都通过mapToObjFunction转换为另一个流；
     * map(ToXxxFunction)：把每个元素都通过mapFunction转换为另一个流；
     * flatMap(ToXxxFunction)：把每个元素都通过flatMapFunction转换为另一个流；
     * filter(Predicate)：通过Predicate过滤所有元素；
     * peek(Consumer)：对每个元素都执行Consumer；
     * sorted()：根据元素的自然顺序排序；
     * sorted(Comparator)：根据指定Comparator排序；
     * forEach(Consumer)：对每个元素都执行Consumer。
     * forEachOrdered(Consumer)：对每个元素都执行Consumer，但按照Stream的顺序执行。
     * toArray()：把Stream转换为数组。
     * reduce(identity, accumulator)：从第一个元素开始，通过accumulator迭代计算最终结果。
     * reduce(accumulator)：从第一个元素开始，通过accumulator迭代计算最终结果。
     * collect(Collector)：把Stream规约成另一种类型的结果。
     * anyMatch(Predicate)：测试是否有任何元素通过了Predicate；
     * allMatch(Predicate)：测试是否所有元素都通过了Predicate；
     * noneMatch(Predicate)：测试是否所有元素都没有通过Predicate；
     * findFirst()：返回第一个元素；
     * findAny()：返回任意一个元素。
     * iterator()：返回Iterator遍历；
     * spliterator()：返回Spliterator遍历。
     * parallel()：返回并行Stream；
     * sequential()：返回串行Stream。
     * unordered()：返回无序的Stream。
     */
    public static void function() {

        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
        long count = longStream.count();
        System.out.println("count = " + count);

    }

    public static void main(String[] args) {

        createLongStream();
    }

}
