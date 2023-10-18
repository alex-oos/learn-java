package com.atguigu.day5;

/**
 * @autoer Alex
 * @since: 2020/5/19 下午 11:04
 * @Descprition:
 */

class TestReverse {

    /**
     * 数组的元素的顺序的反转
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        // array 变成  {5,4,3,2,1}
        // 方法一：创建一个一样长的数组，
        //(1)创建一个等长的数组
        int[] newArray = new int[array.length];

        //(2)为新数组的元素赋值
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[array.length - 1 - i];
        }

        //(3)把原来的数组名指向新数组
        array = newArray;

        //(4)遍历
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
