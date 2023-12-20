package demo.number;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/25 下午2:54
 */
public class BigIntegerDemo {

    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("0");
        int i = bigInteger.compareTo(BigInteger.ZERO);
        System.out.println("i = " + i);

        List<Integer> expectList =
                IntStream.range(0, 9).mapToObj(g -> -g).sorted().collect(Collectors.toList());
        System.out.println(expectList);

        List<Integer> list = IntStream.range(0, 6).mapToObj(h -> -h).collect(Collectors.toList());
        System.out.println("expectList.containsAll(list) = " + expectList.containsAll(list));
        list.remove(3);
        int a = 0;
        for (int j = 0; j < list.size(); j++) {
            if (a != list.get(j)) {
                System.out.println("list.get(j) = " + list.get(j));
            }
        }


    }

}
