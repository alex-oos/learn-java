package com.atguigu.day5;/*数组的相关算法：
1、找出最大值、最小值
2、找出最大值、最小值及其下标
3、求元素的总和和平均值
4、数组的元素的顺序的反转
5、数组的复制
*/
import java.util.Scanner;

class TestArrayCopy_2{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};

        //第二种复制：得到一个新数组，新数组的长度可以比数组短、长、一样，由用户指定
        //要求，不管新数组有多长，都从旧数组的[0]元素开始复制

        Scanner input = new Scanner(System.in);
        System.out.print("请输入新数组的长度：");
        int length = input.nextInt();

        //(1)创建一个新数组
        int[] newArray = new int[length];
        //(2)为新数组的元素赋值
        for(int i=0; i<newArray.length && i<array.length; i++){
            newArray[i] = array[i];
        }

        System.out.println("旧数组：");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i] + "  ");
        }

        System.out.println("新数组：");
        for(int i=0; i<newArray.length; i++){
            System.out.println(newArray[i] + "  ");
        }
    }
}