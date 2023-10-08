package com.atguigu.day2.logic.exer;

class TestLogicExer6 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        //z==42，z++  成立,z=43
        //左边成立，右边继续， y=true 赋值 true
        //true && true结果是true
        if ((z++ == 42) && (y = true)) {
            z++;//z++，z=44
        }


        //x=false，赋值，是false
        //false || ?
        //右边继续， ++z,z==45,  z=45，成立
        //false || true结果为true
        if ((x = false) || (++z == 45)) {
            z++; //z++，z=46
        }

        System.out.println("z=" + z);//46
    }
}
