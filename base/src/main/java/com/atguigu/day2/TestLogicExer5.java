package com.atguigu.day2;

class TestLogicExer5 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        //z==42，z++  成立,z=43
        //左边成立，右边继续， y==true 不成立
        //true && false结果是false
        if ((z++ == 42) && (y == true)) {
            z++;
        }

        //x=false，赋值
        //false || ？
        //右边继续
        //++z，z==45， z=44，不成立
        if ((x = false) || (++z == 45)) {
            z++;
        }

        System.out.println("z=" + z);//44
    }

}