package demo.other;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <P>
 * bit 位运算
 * </p>
 *
 * @author Alex
 * @since 2023/11/1 上午11:19
 */
public class BitDemo {

    public static void main(String[] args) {

        int min = 1 << 7;
        int max = 1 << 14;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("Integer.toBinaryString(min) = " + Integer.toBinaryString(min).length());
        // bit0 到bit14
        List<Integer> list = IntStream.range(0, 14).map(i -> 1 << i).boxed().collect(Collectors.toList());
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);


    }

}
