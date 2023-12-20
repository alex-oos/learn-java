package demo.collection;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/4 下午3:48
 */
public class Listdemo2 {

    public static void main(String[] args) {
        // 在一个集合中找出最小的数，并返回其索引
        List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        System.out.println("collect = " + list);
        // int index = 0;
        // int minValue = list.get(0);
        Integer min = Collections.min(list);
        int index = list.indexOf(min);
        // for (int i = 0; i < list.size(); i++) {
        //     minValue = Math.min(list.get(i), minValue);
        //     index = list.get(i) == minValue ? i : index;
        // }
        Integer i = list.get(index);
        System.out.println("最小的数为：" + i + " 其索引为：" + index);

    }

}
