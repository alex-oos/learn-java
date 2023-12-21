package com.liaoxuefeng.rFunctional.bStream.other;


import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Alex
 * @since 2021/9/10 2:09 下午
 * <P></p>
 */
public class IntStreamDemo {

    /**
     * IntStream是Stream的一个子接口，它代表的元素都是int类型，因此，我们无法直接把一个IntStream转换为Stream，但是我们可以把IntStream转换为Stream，例如：
     */
    public static void createIntStream() {
        // 创建instream 流的三种方式
        // 方式一
        // 生成0到10的数  左闭右开 【0，9】
        IntStream.range(0, 10).forEach(System.out::print);
        System.out.println();
        // 方式二：
        // 生成0到10的数  左闭右闭 【0，10】
        IntStream.rangeClosed(0, 10).forEach(System.out::print);
        System.out.println();
        // 方式三：
        IntStream.of(10, 2, 3, 4, 5).forEach(System.out::print);
        System.out.println();
        // 方式四：
        IntStream.generate(new IntSupplier() {
            int i = 0;

            @Override
            public int getAsInt() {

                i++;
                return i;
            }
        }).limit(10).forEach(System.out::print);

        System.out.println();


    }

    /**
     * IntStream的常用方法如下：
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
     * filter(Predicate)：通过测试predicate的元素被保留；
     * peek(Consumer)：遍历每个元素时，执行consumer；
     * sorted()：排序，只能对Comparable的元素排序；
     * parallel()：并行处理流元素；
     * sequential()：恢复为串行处理流元素。
     * boxed()：把IntStream转换为Stream<Integer>；
     * toArray()：把IntStream转换为int[]数组。
     */
    public static void methods() {

        IntStream.of(10, 2, 3, 4, 5).filter(e -> e > 2).forEach(System.out::print);
        System.out.println();
        // 求个数，
        long count1 = IntStream.of(1, 2, 4, 5, 6, 2).count();
        System.out.println(count1);
        // 求不同的元素个数
        long count = IntStream.of(1, 2, 2, 3).distinct().count();
        System.out.println("count = " + count);

        // instream 转换为list boxed()方法是将IntStream转换为Stream<Integer>： 在使用collect()方法转换为list
        List<Integer> collect = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        System.out.println("collect = " + collect);
        // boxed 在类型转化中特别有用
    }

    public static void main(String[] args) {

        createIntStream();
        methods();
        IntStream.range(0, 1).forEach(System.out::println);
    }

}
