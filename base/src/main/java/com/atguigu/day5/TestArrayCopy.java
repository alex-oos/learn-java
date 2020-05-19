package com.atguigu.day5;

/*数组的相关算法：
1、找出最大值、最小值
2、找出最大值、最小值及其下标
3、求元素的总和和平均值
4、数组的元素的顺序的反转
5、数组的复制
*/
class TestArrayCopy{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};

        //第一种复制：得到一个和原来的数组一样长的新数组
		/*
		//错误的代码
		int[] newArray = array;
		*/
        //(1)创建一个新数组
        int[] newArray = new int[array.length];
        //(2)为新数组的元素赋值
        for(int i=0; i<newArray.length; i++){
            newArray[i] = array[i];
        }

        newArray[1] = 56;

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