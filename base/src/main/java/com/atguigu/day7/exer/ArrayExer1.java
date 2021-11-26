package com.atguigu.day7.exer;


/**
 * @author Alex
 * @date 2021/11/25 4:28 下午
 * <P>
 * 二维数组的练习，求二维数组中所有元素的总和
 * </p>
 */
public class ArrayExer1 {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        int sum = 0; // 记录总数
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("总和是：" + sum);
    }


}
