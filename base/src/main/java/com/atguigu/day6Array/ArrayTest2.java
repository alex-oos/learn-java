package com.atguigu.day6Array;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/11/26 3:28 下午
 * <P>
 * 算法的考查：数组的复制、反转、查找(线性查找、二分法查找)
 * </p>
 */
public class ArrayTest2 {

    // 一、数组的复制：
    public static void arrayCopy() {

        String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};

        // 数组的复制(区别于数组变量的赋值：arr1 = arr)
        String[] arr1 = new String[arr.length];
        // 该赋值是深拷贝，
        System.arraycopy(arr, 0, arr1, 0, arr.length);

        arr[0] = "Demo";
        // 遍历输出
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
    }

    // 二、数组的反转
    public static void arrayReverse() {

        String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};

        //    数组的反转
        //    方式一： 从中间分割，直接将第一个和最后一个替换，一一替换
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        //    方式二： 定义了两个指针，从数组两端开始进行遍历，直接替换两个端的数据，为了更快一些
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        // 方式三：定义了一个新的数组，直接将索引值倒序，输入到一个新的数组中
        String[] tmp = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[arr.length - 1 - i];
        }
        arr = tmp;

        // 遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

    }

    // 数组的查找
    // 线性查找
    public static void arraySearchOne() {

        String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};
        String dest = "BB";
        boolean isFlag = true;
        // 暴力解法
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到元素了，他的索引值是： " + i);
                isFlag = false;
                break;

            }
        }
        if (isFlag) {
            System.out.println("很遗憾没有找到该值");
        }

        //   工具类实现：
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, dest);
        boolean isSucess = i == 1;
        System.out.println(isSucess);
    }

    // 二分查找
    // 前提：数组必须有序
    public static void arraySearchTwo() {

        int[] arr = new int[10];
        // 随机生成数据
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }
        }
        // 先给他排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int tmp = (int) (Math.random() * 100);
        System.out.println(tmp);
        int head = 0;   // 首索引
        int end = arr.length - 1;  // 尾索引
        boolean isFlags = true;
        while (head < end) {
            int middle = end / 2;   // 中间索引
            if (tmp == arr[middle]) {
                System.out.println("找到了元素,索引值为：" + middle);
                isFlags = false;
                break;
            } else if (tmp < arr[middle]) {
                head = middle + 1; // 截取一半，缩小范围查询
            } else {
                end = middle - 1;
            }
        }
        if (isFlags) {
            System.out.println("很遗憾没有找见该元素");
        }
    }


    public static void main(String[] args) {

        arrayCopy();
        arrayReverse();
        arraySearchOne();
        arraySearchTwo();
    }

}
