package demo.streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/4 下午2:22
 */
public class IntStreamTwo {

    public static void main(String[] args) {

        List<Integer> collect = IntStream.range(5, 11).boxed().collect(Collectors.toList());
        System.out.println("collect = " + collect);
        List<Integer> collect1 = IntStream.range(14, 18).boxed().collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
        List<Integer> list = new ArrayList<>(List.of(2, 3, 19, 23, 24, 25, 29, 44, 46, 47, 51, 52));
        List<Integer> collect2 = IntStream.range(34, 42).boxed().collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);

        list.addAll(collect);
        list.addAll(collect1);
        list.addAll(collect2);

        Collections.sort(list);
        System.out.println(list);


    }

}
