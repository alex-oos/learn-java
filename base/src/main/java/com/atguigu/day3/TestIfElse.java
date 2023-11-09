package com.atguigu.day3;

/**
 * @author Alex
 * @since 2020/5/8 上午 12:01
 * 
 */
/*
四、双分支：if...else
语法结构：
if(条件表达式){
	当条件表达式成立时，执行的语句块1;
}else{
	当条件表达式不成立时，执行的语句块2;
}

执行的特点：
这两个分支只执行其中一个，
当条件表达式成立时，执行的语句块1;
当条件表达式不成立时，执行的语句块2;

说明：
（1）if()中写条件表达式，必须是布尔类型
	A：关系表达式
	B：逻辑表达式
	C：布尔变量
（2）如果{}中只有一个语句，那么可以省略{}
	但是：习惯上，我们就算只有一个语句，也保留{}
*/
class TestIfElse{
    public static void main(String[] args){
        //例如：如果年满18岁，就让你进入我的系统，否则，提示未成年不得进入
        int age = 19;
        if(age >= 18){
            System.out.println("欢迎您进入成人世界。。。。");
            System.out.println("玩的尽兴...");
        }else
            System.out.println("未成年不得进入");

    }
}
