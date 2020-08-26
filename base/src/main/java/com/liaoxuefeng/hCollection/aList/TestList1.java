package com.liaoxuefeng.hCollection.aList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李将
 * @since: 2020/6/10 20:25
 * @Descprition:
 */
public class TestList1 {

    static int findMissingNumber(int start, int end, List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;

        }
        return (start + end) * (end - start + 1) / 2 - sum;
    }

    public static void main(String[] args) {
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list);
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

}
