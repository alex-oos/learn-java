package demo.streamdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex
 * @since 2023/10/11 下午5:25
 * <P></p>
 */
public class SortedDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.sort((t1, t2) -> {
            if (t1 > t2) {
                return -1;
            }
            return 0;
        });
        System.out.println("list = " + list);
    }

}
