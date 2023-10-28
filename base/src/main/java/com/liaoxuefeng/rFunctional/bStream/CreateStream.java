package com.liaoxuefeng.rFunctional.bStream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Alex
 * @since 2021/7/13 下午 9:39
 * <p>
 * Stream 流的创建方式：
 * </p>
 */
public class CreateStream {

    /**
     * 方式一：通过使用Stream.of,通过显示值创建一个流。它可以接收任意数量的参数
     */
    public static void createStreamOne() {

        Stream<String> stream = Stream.of("A", "B", "C");
        // forEach()方法相当于内部循环调用，
        // 可传入符合Consumer接口的void accept(T t)的方法引用：
        stream.forEach(System.out::println);

    }

    /**
     * 方式二：创建Stream的方法是基于一个数组或者Collection，这样该Stream输出的元素就是数组或者Collection持有的元素：
     */
    public static void createStreamTwo() {
        // 使用Arrays.stream(T[])方法可以传入一个数组创建Stream：
        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C"});
        // 使用List.stream()方法可以从List创建Stream：
        Stream<String> stream2 = List.of("X", "Y", "Z").stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);

    }

    /**
     * 方式三：通过Stream.generate()创建一个无限流，它不依赖任何输入元素，而是自己按照某种算法不断地生成新的元素：
     * 使用的时候需要注意： 无限流必须先变成有限流再打印，否则会无限执行下去
     */
    public static void createStreamThree() {
        // stream.generate()方法接收一个Supplier<T>类型的函数接口实现，我们可以用lambda表达式来创建：
        Stream<Integer> natual = Stream.generate(new Supplier<>() {
            int n = 0;

            @Override
            public Integer get() {

                n++;
                return n;
            }
        });
        // 注意： 无限流必须先变成有限流再打印，否则会无限执行下去
        natual.limit(20).forEach(System.out::println);

    }


    public static void main(String[] args) {

        createStreamOne();
        createStreamTwo();
        createStreamThree();
    }

}
