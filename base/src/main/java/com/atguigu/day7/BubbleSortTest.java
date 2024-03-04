package com.atguigu.day7;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/11/26 5:29 下午
 * <P>冒泡排序</p>
 */
public class BubbleSortTest {

    public static void main(String[] args) {

        int[] array = new int[10];
        // 随机生成十个不重复的元素
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }
        // 进行冒泡排序
        // 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
        // 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
        // 针对所有的元素重复以上的步骤，除了最后一个。
        // 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
        // 第一个for循环来控制外层循序，一共循环n-1次
        for (int i = 0; i < array.length - 1; i++) {
            // 第二次循环来对比数据，一一替换
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
