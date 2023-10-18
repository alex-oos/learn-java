package com.atguigu.day3;


import java.util.Scanner;

/**
 * @autoer Alex
 * @since: 2020/5/8 上午 12:03
 * @Descprition:
 */

class TestQianTao {

    /**
     * 嵌套：
     * 当外层的条件满足时，才会继续判断内层条件
     */
    public static void main(String[] args) {
        // 1、准备键盘输入
        Scanner input = new Scanner(System.in);

        // 3、提示输入成绩
        System.out.print("岳小鹏的成绩[0-100]：");
        int score = input.nextInt();

        // 4、根据成绩判断
        if (score >= 0 && score <= 100) {
            if (score == 100) {
                System.out.println("奖励一辆BMW");
            } else if (score > 80 && score <= 99) {
                System.out.println("奖励一台iphonex");
            } else if (score >= 60 && score <= 80) {
                System.out.println("奖励一台iPad");
            } else {
                System.out.println("继续努力！");
            }
        } else {
            System.out.println("输入成绩有误！");
        }

    }

}
