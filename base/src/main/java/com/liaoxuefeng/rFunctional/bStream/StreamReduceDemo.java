package com.liaoxuefeng.rFunctional.bStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @autoer Alex
 * @since: 2023/9/26 下午6:19
 * @Descprition:
 */
public class StreamReduceDemo {

    /**
     * reduce()是Stream的一个聚合方法，它可以把一个Stream的所有元素按照聚合函数聚合成一个结果
     * reduce()方法的参数是一个聚合函数，它接收两个参数，返回合并后的值，其中：第一个参数为上次聚合的结果，第二个参数为本次参与聚合的元素
     */
    public static void function() {
        // demo1 累计求和
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Integer result = stream.reduce(0, (sum, n) -> sum + n);
        System.out.println("结果为：" + result);

        // demo2 求乘积
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Integer result2 = stream1.reduce(1, (acc, n) -> acc * n);
        System.out.println("结果为：" + result2);
    }

    /**
     * reduce() 方法也可以对Java对象进行操作
     */
    public static void function1() {

        List<String> props = List.of("profile=native", "debug=true", "logging=warn", "interval=500");
        Map<String, String> map = props.stream()
                // 把k=v转换为Map[k]=v:
                .map(kv -> {
            String[] ss = kv.split("\\=", 2);
            // System.out.println(Arrays.toString(ss));
            return Map.of(ss[0], ss[1]);
        })
                // 把所有Map聚合到一个Map:
           .reduce(new HashMap<String, String>(), (m, kv) -> {
            m.putAll(kv);
            return m;
        });
        // 打印结果
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });

    }

    public static void main(String[] args) {

        function();
        function1();

    }

}
