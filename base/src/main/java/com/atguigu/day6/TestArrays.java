package com.atguigu.day6;

/**
 * @Auther: 李将
 * @Date: 2020/5/20 上午 12:00
 * @Descprition:
 */
/*
数组的工具类：Arrays
在java.util包
（1）Arrays.sort(数组名)：从小到大排序
（2）Arrays.toString(数组名)：把数组的元素拼接成一个字符串，[元素1，元素2，元素3...]
（3）Arrays.fill(数组名，value值）：把数组每一个元素都填充为value值
（4）Arrays.fill(数组名，from,to, value值）：把数组[from,to)的位置填充为value值
（5）Arrays.copyOf(原数组名,新数组的长度)：用一个新数组接收一下
	新数组 = Arrays.copyOf(原数组名,新数组的长度);
（6）Arrays.copyOfRange(原数组名，from, to)：to可以超过原数组的下标范围，新数组的长度是to-from，to不包含
	新数组 = Arrays.copyOfRange(原数组名,from, to);
（7）Arrays.binarySearch(数组名，要查找的value值)
	这个方法的前提，必须保证数组是有序，否则结果是不保证正确的


API：
俗名：帮助文档
专业的名称：应用程序编程接口 Application Pragramming Interface

数学的工具类：Math
在java.lang包
Math.sqrt(x)
Math.random()
*/
import java.util.Arrays;

class TestArrays {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 7};

        Arrays.sort(arr);

        //看结果
        System.out.println(Arrays.toString(arr));

        //填充
        //Arrays.fill(arr, 5);//填充所有元素为5
        //Arrays.fill(arr, 0, 2,5);//填充[0,2)的元素为5
        //看结果
        //System.out.println(Arrays.toString(arr));

        //int[] newArray = Arrays.copyOf(arr, 10);
        //int[] newArray = Arrays.copyOfRange(arr, 2,10);

        //看结果
        //System.out.println(Arrays.toString(newArray));

        int index = Arrays.binarySearch(arr, 6);
        System.out.println("6在arr数组中的位置是：" + index);
    }
}
