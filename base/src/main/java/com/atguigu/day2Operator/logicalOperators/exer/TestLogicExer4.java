package com.atguigu.day2Operator.logicalOperators.exer;

class TestLogicExer4 {
    public static void main(String[] args) {
        int x = 1, y = 1;


        //||左边：x==1，x++，成立true,x=2
        //左边已经是true，这里是短路||
        //右边不看了
        //true || ? 结果都为true
        if (x++ == 1 || ++y == 1) {
            if (x++ == 1 || ++y == 1) {
                x = 7;
            }
            System.out.println("x=" + x + ",y=" + y);//x=7,y=1

        }
    }
}
