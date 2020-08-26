package com.atguigu.day5;

/**
 * @author: 李将
 * @since: 2020/5/19 下午 11:03
 * @Descprition:
 */
/*
数组的内存结构图
*/
class TestRAM{
    public static void main(String[] args){
		/*
		//1、动态初始化
		//(1)声明数组
		int[] array;

		//(2)初始化
		array = new int[5];

		//(3)给元素赋值
		array[0] = 32;
		*/

        //2、静态初始化
        //(1)声明数组
        int[] array;

        //(2)静态初始化
        array = new int[]{1,2,3,4,5};
    }
}