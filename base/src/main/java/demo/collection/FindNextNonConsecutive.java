package demo.collection;

import java.util.List;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/28 下午5:25
 */


public class FindNextNonConsecutive {

    // 在一个有序的列表中，找出第一个不连续的数，例如：[0, -1,-1,-2,-2 -2, -3, -4, -5]，则输出 -5
    public static void main(String[] args) {

        List<Integer> dataList = List.of(0, -1, -2, -3, -4, -5);
        List<Integer> dataList1 = List.of(0, -1, -1, -2, -2, -4, -5, -7);
        findNextNonConsecutive(dataList1);
    }

    public static void findNextNonConsecutive(List<Integer> dataList) {

        if (dataList == null || dataList.isEmpty()) {
            System.out.println("列表为空");
            return;
        }

        int prevNonConsecutive = dataList.get(0);

        for (int i = 0; i < dataList.size() - 1; i++) {
            int current = dataList.get(i);
            int end = dataList.get(i + 1);
            if (current == end) {
                continue;
            }
            if (prevNonConsecutive != current) {
                System.out.println("不连续数 " + prevNonConsecutive + " 的后一位数据是 " + current);
                break;
            }

            prevNonConsecutive--;

        }
    }

}
