package com.atguigu.day6Array;

/*
一、数组的相关概念
数组：
通俗的讲：一组数
本质上：数组是一个容器，用来装数据

数组(array)的定义：（了解）
	就是把一组相同数据类型的数据，按照一定的顺序排列，组合到一起。
	我们把这组相同数据类型的变量，数据，用一个统一的名称进行管理。这个统一的名称，叫做数组名。
	其中的每一个数据我们称为元素(element)，如何表示一个元素，通过下标，索引（index）
	这个数组的元素的个数，我们称为数组的长度（length)

二、如何声明一个数组
语法格式：
	元素的数据类型[] 数组名;

三、如何为数组初始化
1、数组本身初始化：
	确定数组的长度，确定元素的个数
	本质上，申请一整块连续的空间，用来装数据

	语法格式：
		数组名 = new  元素的数据类型[数组的长度];
2、数组的元素初始化
	如果数组的元素不赋值，有初始值，有默认初始值。

	byte,short,int,long ： 0
	float,double：0.0
	boolean：false
	char：\u0000  Unicode编码值为0的字符

	也可以手动初始化。
	语法格式：
		数组名[下标] = 值;

四、如何表示数组的各个概念
1、数组的元素：数组名[下标]
2、下标的范围：[0,数组的长度-1]

		为什么从0开始？
		数组名也是一个变量，而且是一个引用数据类型的变量。
		数组名存储的是这块连续内存空间的首地址。
		第一个元素：数组名[0]表示距离首地址的偏移量为0
		第二个元素：数组名[1]表示距离首地址的偏移量为1
3、数组的长度：数组名.length



数据类型：
基本数据类型（8种）
引用数据类型：类、接口、数组、枚举
	Scanner input = new Scanner(System.in);
	//input就是一个引用数据类型的变量

	String name = "chailinyan";
	//name也是一个引用数据类型的变量

*/
class TestArray{
    public static void main(String[] args){
        //请组长把本组的每一个学员的成绩，录入，并保存
        //后续可能需要，找最高分，最低分，排序，....

        //这么做不方便后面的统一管理，例如：排序等
		/*
		int s1 = 89;
		int s2 = 87;
		int s3 = 56;
		*/

        //int a;//声明变量

        //int[] scores;//声明数组
        //scores = new int[5];//数组的初始化，确定数组的长度，一共可以装5个int的整数

        //元素的数据类型：int
        //数组名：scores
        //数组的长度：scores.length，值是5
        //下标的范围：0~4
        //元素有哪些？scores[0],scores[1],scores[2],scores[3],scores[4]
        int[] scores = new int[5];

		/*
		System.out.println("第一个元素的值是：" + scores[0]);
		System.out.println("第二个元素的值是：" + scores[1]);
		System.out.println("第三个元素的值是：" + scores[2]);
		System.out.println("第四个元素的值是：" + scores[3]);
		System.out.println("第五个元素的值是：" + scores[4]);
		//System.out.println("第五个元素的值是：" + scores[5]);//错误的，会导致数组下标越界异常
		*/

        for(int index = 0; index<5; index++){
            System.out.println("第"+ (index+1)+"个元素的值是：" + scores[index]);
        }
        scores[0] = 89;//第一个元素，第一个数据
        scores[1] = 87;//第二个元素，第一个数据
        scores[2] = 56;//第三个元素，第一个数据
        scores[3] = 99;//第四个元素，第一个数据
        scores[4] = 78;//第五个元素，第一个数据

        //赋值之后再遍历，挨个看看元素的值
        for(int index = 0; index<scores.length; index++){
            System.out.println("第"+ (index+1)+"个元素的值是：" + scores[index]);
        }
    }
}
