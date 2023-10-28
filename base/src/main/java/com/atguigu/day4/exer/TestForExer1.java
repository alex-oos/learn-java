package com.atguigu.day4.exer;

/**
 * @author Alex
 * @since 2020/5/17 上午 12:10
 * @Descprition:
 */
/*
打印1-100之间的偶数
*/
public class TestForExer1 {
    public static void main(String[] args) {
        //思路一：对1-100之间的每一个数都判断是否是偶数，是偶数就打印
		/*
		for(int i=1; i<=100; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}*/

        //思路二：第一个偶数2,第二个偶数：2+2...
        for(int i=2; i<=100; i+=2){
            System.out.println(i);
        }
    }
}
