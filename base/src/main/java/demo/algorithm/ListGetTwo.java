package demo.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <P>
 * 给一个数组，取出相邻的两个元素
 * </p>
 *
 * @author Alex
 * @since 2023/11/10 下午5:19
 */
public class ListGetTwo {

    /**
     * 暴力解法， 写一个for循环，根据索引值，取出相邻的两个元素
     */
    public static List<List<Integer>> function(List<Integer> list) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            List<Integer> tmp = new ArrayList<>();
            int first = list.get(i);
            int second = list.get(i + 1);
            tmp.add(first);
            tmp.add(second);
            result.add(tmp);
        }
        System.out.println("result = " + result);
        return result;

    }

    /**
     * 使用 instream 和maptoObj 来解决
     */
    public static List<List<Integer>> f1(List<Integer> list) {

        List<List<Integer>> collect = IntStream.range(0, list.size() - 1).mapToObj(i -> List.of(list.get(i), list.get(i + 1))).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        return collect;

    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 4, 7, 9);
        function(list);
        f1(list);


    }

}
