package com.atguigu.day6Array.exer;


/**
 * @author Alex
 * @since 2021/11/25 6:47 下午
 * <P>
 * 使用二维数组打印杨辉三角形
 * 【提示】
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 * </p>
 */
public class YangHui {

    public static void main(String[] args) {
        //1、定义一个二维数组
        int[][] arr = new int[10][];

        //2、给数组的元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];

            //2、1给首元素赋值
            arr[i][0] = arr[i][i] = 1;
            //2、2给每行非首末元素赋值
            for (int j = 1; j < arr[i].length-1; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }


        }

        //3、遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");

            }
            System.out.println();
        }

    }

}
