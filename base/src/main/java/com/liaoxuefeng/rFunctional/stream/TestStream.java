package com.liaoxuefeng.rFunctional.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: TangKaiZe
 * @since: 2021/7/13 下午 9:39
 * <p>
 * steam 流的创建方式
 * </p>
 */
public class TestStream {

    /**
     * 方式一：Stream.of
     */
    public static void createStreamOne() {

        Stream<String> stream = Stream.of("A", "B", "C");
        // forEach()方法相当于内部循环调用，
        // 可传入符合Consumer接口的void accept(T t)的方法引用：
        stream.forEach(System.out :: println);

    }

    /**
     * 创建Stream的方法是基于一个数组或者Collection，这样该Stream输出的元素就是数组或者Collection持有的元素：
     */
    public static void createStreamTwo() {

        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C"});
        Stream<String> stream2 = List.of("X", "Y", "Z").stream();
        stream1.forEach(System.out :: println);
        stream2.forEach(System.out :: println);

    }

}
