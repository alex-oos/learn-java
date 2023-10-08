package com.atguigu.day5;

import java.util.Scanner;

/*数组的相关算法：
1、找出最大值、最小值
2、找出最大值、最小值及其下标
3、求元素的总和和平均值
4、数组的元素的顺序的反转
5、数组的复制
*/
class TestArrayCopy {

    // 第一种复制：得到一个和原来的数组一样长的新数组

    public static void function1() {

        int[] array = {1, 2, 3, 4, 5};

		/*
		//错误的代码
		int[] newArray = array;
		*/
        //(1)创建一个新数组
        int[] newArray = new int[array.length];
        //(2)为新数组的元素赋值
        System.arraycopy(array, 0, newArray, 0, newArray.length);

        newArray[1] = 56;

        System.out.println("旧数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("新数组：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "  ");
        }
    }

    // 第二种复制：得到一个新数组，新数组的长度可以比数组短、长、一样，由用户指定
    // 要求，不管新数组有多长，都从旧数组的[0]元素开始复制
    public static void function2() {

        int[] array = {1, 2, 3, 4, 5};

        Scanner input = new Scanner(System.in);
        System.out.print("请输入新数组的长度：");
        int length = input.nextInt();

        //(1)创建一个新数组
        int[] newArray = new int[length];
        //(2)为新数组的元素赋值
        for (int i = 0; i < newArray.length && i < array.length; i++) {
            newArray[i] = array[i];
        }

        System.out.println("旧数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println();

        System.out.println("新数组：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "  ");
        }

    }

    // 第三种复制：得到一个新数组，新数组从旧数组的[from]开始，到[to]结束
    // from和to由用户决定，说明from必须在旧数组的范围内，to可以超过旧数组的范围
    // 假设[from,to)
    public static void function3() {

        int[] array = {1, 2, 3, 4, 5};


        Scanner input = new Scanner(System.in);

        System.out.print("请输入from：");
        int from = input.nextInt();// 1

        System.out.print("请输入to：");
        int to = input.nextInt();// 5

        //(1)创建一个新数组
        int[] newArray = new int[to - from];
        //(2)为新数组的元素赋值
        for (int i = 0; i < newArray.length && from + i < array.length; i++) {
            newArray[i] = array[from + i];
        }

        System.out.println("旧数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "  ");
        }

        System.out.println("新数组：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + "  ");
        }
    }

    public static void main(String[] args) {

        function1();
        function2();
        function3();

    }

}
