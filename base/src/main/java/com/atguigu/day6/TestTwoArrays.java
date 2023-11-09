package com.atguigu.day6;


/**
 * @author Alex
 * @since 2020/5/26 18:40
 *  <p>
 * * 二维数组的使用
 * * 1.理解：
 * * 对于二维数组的理解，我们可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。
 * * 其实，从数组底层的运行机制来看，其实没有多维数组。
 * *
 * * 2. 二维数组的使用:
 * *   ① 二维数组的声明和初始化
 * *   ② 如何调用数组的指定位置的元素
 * *   ③ 如何获取数组的长度
 * *   ④ 如何遍历数组
 * *   ⑤ 数组元素的默认初始化值 :见 ArrayTest3.java
 * *   ⑥ 数组的内存解析 :见 ArrayTest3.java
 *
 * </p>
 */
public class TestTwoArrays {

    public static void main(String[] args) {
        //    1、二维数组的声明和初始化
        int[] arr = new int[]{1, 2, 3};  //一维数组
        //    静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {1, 2, 4}};
        //    动态初始化1
        String[][] arr2 = new String[2][2];
        //    动态初始化2
        String[][] arr3 = new String[3][];


        //2.如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);
        System.out.println(arr2[1][1]);

        arr3[1] = new String[4];
        System.out.println("arr3 = " + arr3[1][0]);

        //    3、获取数组的长度
        System.out.println("arr1.length = " + arr1.length);
        System.out.println("arr1[0].length = " + arr1[0].length);
        System.out.println("arr1[1].length = " + arr1[1].length);

    //    4、如何遍历二维数组
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] +",");
            }
            System.out.println();
        }


    }

}
