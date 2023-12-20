package demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <P>
 * 目前有一个list，list 中有 n个元素，求出相邻两个元素的差值，判断相邻两个元素的差值是绝对值,然后将相邻的两个差值进行求差值，判断最终的差值是否在1到5 之内，如果在之内，需要记录差值中间的那个元素到一个新的list中
 * </p>
 *
 * @author Alex
 * @since 2023/10/30 下午2:14
 */
public class ListDemo {

    private static boolean isWithinRange(int diff1, int diff2) {

        int finalDiff = Math.abs(diff2 - diff1);
        return finalDiff >= 1 && finalDiff <= 5;
    }

    public static List<Integer> getDifferencesWithinRange(List<Integer> originalList) {

        List<Integer> result = new ArrayList<>();

        if (originalList.size() >= 3) {
            for (int i = 0; i < originalList.size() - 2; i++) {
                int diff1 = Math.abs(originalList.get(i + 1) - originalList.get(i));
                int diff2 = Math.abs(originalList.get(i + 2) - originalList.get(i + 1));

                if (isWithinRange(diff1, diff2)) {
                    result.add(originalList.get(i + 1));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> originalList = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        Collections.shuffle(originalList);
        System.out.println(originalList);
        List<Integer> result = getDifferencesWithinRange(originalList);
        System.out.println(result);


    }

}
