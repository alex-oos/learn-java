package com.liaoxuefeng.rFunctional.bStream.other;

import java.util.OptionalDouble;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;

/**
 * @ClassName DoubleStreamDemo
 * @Description
 * @Author Alex
 * @Version 1.0
 * @since 2023/9/26 22:34
 */
public class DoubleStreamDemo {

    public static void createDoubleStream() {
        // 创建doubleStream 流的三种方式
        // 方式一
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        doubleStream.forEach(System.out::print);
        System.out.println();
        // 方式二：
        // double 迭代器
        DoubleStream.iterate(1.0, n -> n + 1).limit(10).forEach(System.out::print);
        System.out.println();
        // 方式三：
        // double 生成器
        DoubleStream.generate(new DoubleSupplier() {
            double i = 0.1;

            @Override
            public double getAsDouble() {

                i++;
                return i;
            }
        }).limit(10).forEach(System.out::print);


    }

    /**
     * DoubleStream的常用方法如下：
     * <p>
     * count()：返回元素个数；
     * average()：返回元素平均值；
     * max()：返回最大值；
     * min()：返回最小值；
     * sum()：返回总和。
     */
    public static void methods() {

        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        // 统计个数
        long count = doubleStream.count();
        System.out.println("count = " + count);

        DoubleStream doubleStrea1 = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
        // 求平均值
        OptionalDouble average = doubleStrea1.average();
        System.out.println("average = " + average);
    }

    public static void main(String[] args) {

        createDoubleStream();
        methods();
    }

}
