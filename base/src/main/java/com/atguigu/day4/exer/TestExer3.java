package com.atguigu.day4.exer;

/**
 * @autoer Alex
 * @since: 2020/5/16 下午 6:51
 * @Descprition:
 */
//3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
public class TestExer3 {
    public static void main(String[] args) {
        int days = 0;
        for (int line = 3000; line >= 5; line /= 2) {
            days++;
        }
        System.out.println("days = " + days);

        int i = 3000;
        int j ;
        for (j=1 ; j < i; j++) {
            if (i > 5) {
                i /= 2;
            }else {
                break;
            }
        }
        System.out.println(j);
    }
}
