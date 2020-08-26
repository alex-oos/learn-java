package com.atguigu.day4.exer;

/**
 * @author: 李将
 * @since: 2020/5/16 下午 7:54
 * @Descprition:
 */
/*5、输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
    Math.pow(2,3) 2的三次方 */
public class TestExer5 {
    public static void main(String[] args) {
        //三位数的范围：100~999
        //所有的三位数，挨个检查他是不是水仙花数，是就打印它
        System.out.println("所有的水仙花数有：");
        for (int i = 100; i < 1000; i++) {
            int hundred = i / 100;
            int ten = i / 10 % 10;
            int unit = i % 10;
            if (i == Math.pow(unit, 3) + Math.pow(ten,3) + Math.pow(hundred, 3)) {
                System.out.println("i = " + i);
            }
           /* if(i == unit*unit*unit + ten*ten*ten + hundred*hundred*hundred){
                System.out.println(i);
            }*/
        }
    }
}
