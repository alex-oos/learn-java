package com.atguigu.day4;/*
����do...whileѭ��
do{
	ѭ���壺��Ҫ�ظ�ִ�еĴ���
}while(ѭ������);

ִ�еĹ��̣�
(1)��ִ��һ��ѭ�������
(2)���ж�ѭ������
(3)�������������Ϊtrue���ٴ�ִ��ѭ����
(4)�ص�(2)
(5)ֱ��ѭ��������������Ϊfalse������ѭ��

���ѭ���������Ƚ����ԣ����ǲ���for��������ʼ����ֹ�����Ƚ���ȷ�������Ƚ����ԣ�
ѡ��while������������ѭ����Ҫִ��һ�Σ��������Ը�Ϊdo...while
����ѭ�����ǿ��������������ġ�
*/
import java.util.Scanner;

/*
三、do...while循环
do{
	循环体：需要重复执行的代码
}while(循环条件);

执行的过程：
(1)先执行一次循环体语句
(2)再判断循环条件
(3)如果条件成立，为true，再次执行循环体
(4)回到(2)
(5)直到循环条件不成立，为false，结束循环

如果循环的条件比较明显，但是不像for那样，起始和终止条件比较明确，次数比较明显，
选择while，当出现至少循环体要执行一次，这样可以改为do...while
三种循环都是可以无条件互换的。
*/

class TestDoWhile{
	public static void main(String[] args){
		//从键盘不断输入整数，统计正数、负数的个数，输入0结束
		Scanner input = new Scanner(System.in);

		int zheng = 0;
		int fu = 0;

		int num;
		do{
			System.out.println("请输入一个整数：");
			num = input.nextInt();
			if(num>0){
				zheng++;
			}else if(num<0){
				fu++;
			}

		}while(num!=0);

		System.out.println("正数的个数：" + zheng);
		System.out.println("负数的个数：" + fu);
	}
}