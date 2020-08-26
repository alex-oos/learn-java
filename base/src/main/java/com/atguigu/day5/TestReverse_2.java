package com.atguigu.day5;

/**
 * @author: 李将
 * @since: 2020/5/19 下午 11:04
 * @Descprition:
 */
/*
数组的相关算法：
1、找出最大值、最小值
2、找出最大值、最小值及其下标
3、求元素的总和和平均值
4、数组的元素的顺序的反转

*/
class TestReverse_2{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};

        //array 变成  {5,4,3,2,1}
        //方法二：首尾交换
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

        //遍历
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}