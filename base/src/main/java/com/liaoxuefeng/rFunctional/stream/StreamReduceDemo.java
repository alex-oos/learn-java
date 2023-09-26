package com.liaoxuefeng.rFunctional.stream;

import java.util.stream.Stream;

/**
 * @author: Alex
 * @date: 2023/9/26 下午6:19
 * @Descprition:
 */
public class StreamReduceDemo {

    /**
     * reduce()是Stream的一个聚合方法，它可以把一个Stream的所有元素按照聚合函数聚合成一个结果
     * reduce()方法的参数是一个聚合函数，它接收两个参数，返回合并后的值，其中：第一个参数为上次聚合的结果，第二个参数为本次参与聚合的元素
     */
    public static void function() {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Integer result = stream.reduce(0, (sum, n) -> sum + n);
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {

        function();

    }

}
