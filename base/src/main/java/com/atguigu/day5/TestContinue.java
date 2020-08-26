package com.atguigu.day5;

/**
 * @author: 李将
 * @since: 2020/5/19 下午 10:53
 * @Descprition:
 */
//请打印1-10之间不是3或5的倍数的数字
public class TestContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
