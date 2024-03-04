package com.atguigu.day6Array;


import java.util.Arrays;

/**
 * @author Alex
 * @since 2021/12/2 6:51 上午
 * <P>
 * java.util.Arrays:操作数组的工具类，里面定义了很多操作数组的方法
 * 数组的工具类：Arrays
 * 在java.util包
 * （1）Arrays.sort(数组名)：从小到大排序
 * （2）Arrays.toString(数组名)：把数组的元素拼接成一个字符串，[元素1，元素2，元素3...]
 * （3）Arrays.fill(数组名，value值）：把数组每一个元素都填充为value值
 * （4）Arrays.fill(数组名，from,to, value值）：把数组[from,to)的位置填充为value值
 * （5）Arrays.copyOf(原数组名,新数组的长度)：用一个新数组接收一下
 * 新数组 = Arrays.copyOf(原数组名,新数组的长度);
 * （6）Arrays.copyOfRange(原数组名，from, to)：to可以超过原数组的下标范围，新数组的长度是to-from，to不包含
 * 新数组 = Arrays.copyOfRange(原数组名,from, to);
 * （7）Arrays.binarySearch(数组名，要查找的value值)
 * 这个方法的前提，必须保证数组是有序，否则结果是不保证正确的
 * <p>
 * <p>
 * API：
 * 俗名：帮助文档
 * 专业的名称：应用程序编程接口 Application Pragramming Interface
 * <p>
 * 数学的工具类：Math
 * 在java.lang包
 * Math.sqrt(x)
 * Math.random()
 * </p>
 */
public class ArrayUtil {

    public static void function() {

        int[] arr = {3, 2, 1, 6, 7};

        Arrays.sort(arr);

        // 看结果
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 6);

        System.out.println("6在arr数组中的位置是：" + index);

        // 填充
        Arrays.fill(arr, 5);// 填充所有元素为5

        // 看结果
        System.out.println(Arrays.toString(arr));

        // 填充[0,2)的元素为5
        Arrays.fill(arr, 0, 2, 5);

        // 看结果
        System.out.println(Arrays.toString(arr));

        int[] newArray = Arrays.copyOf(arr, 10);

        // 看结果
        System.out.println(Arrays.toString(newArray));

        int[] newArray1 = Arrays.copyOfRange(arr, 2, 10);

        // 看结果
        System.out.println(Arrays.toString(newArray1));


        // for each 遍历打印数组中的元素
        for (int n : arr) {
            System.out.println("n = " + n);

        }
    }

    public static void function2() {
        // 1.boolean equals(int[] a,int[] b):判断两个数组是否相等。
        int[] arr1 = new int[]{5, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 4, 3};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);
        // 2.String toString(int[] a):输出数组信息。
        System.out.println(Arrays.toString(arr1));
        // 3.void fill(int[] a,int val):将指定值填充到数组之中。
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));
        // 4.void sort(int[] a):对数组进行排序。
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // 5.int binarySearch(int[] a,int key)
        int[] arr3 = new int[]{-9, -8, 1, 3, 6, 10};
        int indexOf = Arrays.binarySearch(arr3, 5);
        if (indexOf > 0) {
            System.out.println(indexOf);
        } else {
            System.out.println("值没有找见");
        }
    }


    public static void main(String[] args) {

        function();
        function2();
    }

}
