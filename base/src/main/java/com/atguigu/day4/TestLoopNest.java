package com.atguigu.day4;

/*
ѭ��Ƕ�ף�
��ѭ��ѭ��һ�Σ���ѭ��ѭ��һ��

*****
*****
*****
*****

*/
/*
循环嵌套：
外循环循环一次，内循环循环一轮

*****
*****
*****
*****

*/
class TestLoopNest{
	public static void main(String[] args){
		for(int i=1; i<=4; i++){
			//System.out.println("*****");
			//(1)连续打印5颗星
			for(int j=1; j<=5; j++){
				System.out.print("*");
			}
			//(2)换行
			System.out.println();
		}
		/*
		(1)int i=1;
		(2)i<=4;成立
		(3)外循环的循环体
			for(int j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
			（4）内循环 int j=1;
			(5)j<=5成立
			(6)内循环的循环体   System.out.print("*");
			(7)j++  j=2
			(8)j<=5成立
			(9)内循环的循环体   System.out.print("*");
			(10)j++ j=3
			(11)j<=5成立
			(12)内循环的循环体   System.out.print("*");
			(13)j++ j=4
			(14)j<=5成立
			(15)内循环的循环体   System.out.print("*");
			(16)j++ j=5成立
			(17)j<=5成立
			(18)内循环的循环体   System.out.print("*");
			(19)j++ j=6
			(20)j<=5  不成立
			内循环第一轮结束

			System.out.println();
			外循环循环体才完成一次
		（21）i++  i=2
		(22)判断外循环的条件  i<=4;成立
		(23)执行外循环的循环体第二轮
			for(int j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
			（24）内循环 int j=1;
			(25)j<=5成立
			(26)内循环的循环体   System.out.print("*");
			(27)j++  j=2
			(28)j<=5成立
			(29)内循环的循环体   System.out.print("*");
			(30)j++ j=3
			(31)j<=5成立
			(32)内循环的循环体   System.out.print("*");
			(33)j++ j=4
			(34)j<=5成立
			(35)内循环的循环体   System.out.print("*");
			(36)j++ j=5成立
			(37)j<=5成立
			(38)内循环的循环体   System.out.print("*");
			(39)j++ j=6
			(40)j<=5  不成立
			内循环第二轮结束

			System.out.println();
			外循环循环体才完成二次
		(41)i++  i=3
			.....
		
		*/


	}
}