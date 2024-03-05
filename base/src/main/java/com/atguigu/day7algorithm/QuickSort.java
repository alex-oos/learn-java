package com.atguigu.day7algorithm;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/12/1 4:37 下午
 * <P>
 * 快速排序
 * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
 * 则分别对这两部分继续进行排序，直到整个序列有序。
 *
 * </p>
 */
public class QuickSort {

    private static void swap(int[] data, int i, int j) {

        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    /**
     * 排序思想：
     * 1. 从数列中挑出一个元素，称为"基准"（pivot），
     * 2. 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区结束之后，
     * 该基准就处于数列的中间位置。这个称为分区（partition）操作。
     * 3. 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     * 4. 递归的最底部情形，是数列的大小是零或一，也就是永远都已经被排序好了。虽然一直递归下去，但是这个算法总会结束，因为在每次的迭代
     * （iteration）中，它至少会把一个元素摆到它最后的位置去。
     *
     * @param data  数组
     * @param start 首索引
     * @param end   尾索引
     */
    private static void subSort(int[] data, int start, int end) {
        // 首索引值
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0) ;
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);// 递归调用
            subSort(data, high + 1, end);
        }
    }

    public static void quickSort(int[] data) {

        subSort(data, 0, data.length - 1);
    }


    public static void main(String[] args) {

        int[] data = {9, -16, 30, 23, -30, -49, 25, 21, 30};
        System.out.println("排序之前：\n" + Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + Arrays.toString(data));
    }

}
