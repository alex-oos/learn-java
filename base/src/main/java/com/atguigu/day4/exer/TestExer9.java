package com.atguigu.day4.exer;

/**
 * @Auther: 李将
 * @Date: 2020/5/16 下午 11:56
 * @Descprition:
 */
/*
9、一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
例如6=1＋2＋3.编程 找出1000以内的所有完数
*/
public class TestExer9 {
    public static void main(String[] args) {

        //需要判断1000以内的所有数
        for (int i = 1; i < 1000; i++) {
            int sum = 0;//每一个i，的所有因子之和都从0开始累加
            //对于每一个i，要判断它是否是完数
            //（1）把i的所有因子相加
            //从1~i-1之间能够把i整除的都是i的因子
            for (int j = 1; j < i; j++) {

                //判断j是否是i的因子
                if (i % j == 0) {
                    //j是i的因子
                    sum += j;
                }
            }
            //（2）把因子和 与 i比较，如果相等，i就是完数
            if (sum == i) {
                System.out.println(i);
            }
        }

		/*
		(1)int i=1
		(2)i<1000
		(3)执行外循环的循环体
			int sum = 0;
			for(int j=1; j<i; j++){
				if(i%j==0){
					//j是i的因子
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
			(4)int sum = 0;
			(5)int j=1
			(6)j<i  不成立
			(7)if(sum==i)  0==1不成立

		(8)i++  i=2
		(9)i<1000成立
		(10)外循环的第二次循环体
			int sum = 0;
			for(int j=1; j<i; j++){
				if(i%j==0){
					//j是i的因子
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
			(11)int sum = 0;
			(12)int j=1
			(13）j<i  成立
			(14)if(2%1==0)成立
			(15)sum+=j;  sum = 0 + 1 = 1
			(16)j++  j=2
			(17)j<i  不成立  内循环第二轮结束
			(18)if(sum == i)  1==2不成立
		（19）i++ i=3
		(20)i<1000成立
		(21)外循环的第三次循环体
			int sum = 0;
			for(int j=1; j<i; j++){
				if(i%j==0){
					//j是i的因子
					sum += j;
				}
			}
			if(sum == i){
				System.out.println(i);
			}
			(22)int sum=0;
			(23)int j=1;
			(24)j<i  成立
			(25)if(3%1==0)成立
			(26)sum+=j  sum = 0 + 1 = 1
			(27)j++  j=2
			(28)j<i 成立
			(29)if(3%2==0)不成立
			(30)j++ j=3
			(31)j<i  不成立  内循环的第三轮结束
			(32)if(sum==i)  不成立
		(33)i++
		....

		*/
    }
}