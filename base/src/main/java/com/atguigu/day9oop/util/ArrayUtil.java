package com.atguigu.day9oop.util;


import cn.hutool.core.util.RandomUtil;

/**
 * @author Alex
 * @since 2021/12/8 5:03 下午
 * <P>
 * 自定义数组的工具
 * </p>
 */
public class ArrayUtil {

    // 求数组的最大值
    public int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    // 求数组的最小值
    public int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    // 求数组的平均值
    public double getAvgValue(int[] arr) {
        return getSum(arr) / arr.length;
    }
    // 求数组的总和
    public int getSum(int[] arr) {
        int sumValue = 0;
        for (int i = 0; i < arr.length; i++) {
            sumValue += arr[i];
        }
        return sumValue;
    }
    // 反转数组
    public int[] reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i > j; i++, j--) {
            arr[i] = arr[j];
        }
        return arr;
    }

    public String[] reverse(String[] arr) {
        for (int i = 0; i > arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // 复制数组
    public int[] copyArray(int[] arr) {
        int[] tmp = new int[arr.length];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        return tmp;
    }
    // 数组排序
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                  /*  int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;*/
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
    //正确的：交换数组中指定两个位置元素的值
    public int[] swap(int[] arr, int i, int n) {
        int tmp = arr[i];
        arr[i] = arr[n];
        arr[n] = tmp;
        return arr;

    }
    // 遍历数组
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // 查找指定元素 ,返回索引值
    public int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }

        }
        return -1;
    }

    /*生成一个数组，要求数组中的元素都不重复*/
    public int[] getArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }

        }
        return arr;
    }

    public char[] getCharArray(int length) {
        char[] arr = new char[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomUtil.randomChar();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        return arr;
    }


}
