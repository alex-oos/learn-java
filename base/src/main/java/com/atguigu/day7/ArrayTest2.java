package com.atguigu.day7;


import javax.imageio.metadata.IIOInvalidTreeException;
import java.util.Arrays;

/**
 * @author Alex
 * @date 2021/11/26 3:28 下午
 * <P>
 * 算法的考查：数组的复制、反转、查找(线性查找、二分法查找)
 * </p>
 */
public class ArrayTest2 {

    //一、数组的复制：
    public static void arrayCopy() {
        String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};

        //数组的复制(区别于数组变量的赋值：arr1 = arr)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        //遍历输出
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
    }
    //二、数组的反转
    public static void arrayReverse() {
        String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};

        //    数组的反转
        //    方式一：
       /* for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }*/
        //    方式二：
       /* for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }*/
        //方式三：
       /* String[] tmp = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[arr.length - 1 - i];
        }
        arr = tmp;*/

        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

    }
    //数组的查找
    //线性查找
    public static void arraySearchOne() {
        String[] arr = new String[]{"JJ", "AA", "BB", "CC", "DD"};
        String dest = "BB";
        boolean isFlag = true;
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
    }
    //二分查找
    //前提：数组必须有序
    public static void arraySearchTwo() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }
        }
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int tmp = (int) (Math.random() * 100);
        System.out.println(tmp);
        int head = 0;   // 首索引
        int end = arr.length - 1;  // 尾索引
        boolean isFlags = true;
        while (head < end) {
            int middle = end / 2;   // 中间值
            if (tmp == arr[middle]) {
                System.out.println("找到了元素,索引值为：" + middle);
                isFlags = false;
                break;
            } else if (tmp < arr[middle]) {
                head = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if (isFlags) {
            System.out.println("很遗憾没有找见该元素");
        }
    }


    public static void main(String[] args) {
        arraySearchTwo();
    }

}
