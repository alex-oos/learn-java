package com.atguigu.day3;

/**
 * @Auther: 李将
 * @Date: 2020/5/8 上午 12:04
 * @Descprition:
 */
/*
分支结构：
1、条件判断：if..else
2、选择结构：switch..case

一、选择结构
语法格式：
switch(表达式){
	case 常量值1:
		语句块1;
		【break;】
	case 常量值2:
		语句块2;
		【break;】
	...
	【
	default:
		语句块n+1;
		【break;】
	】
}

执行特点：
“入口”：
	A：当表达式的值与其中一个case的常量值匹配，就从这个分支进入，一旦进入顺序往下执行
	B：当表达式的值与所有的case都不匹配，如果此时存在default，就从default进入，一旦进入顺序往下执行
“出口”：
	A：遇到switch的结束}
	B：遇到break

说明：
（1）switch()中的表达式的类型也有要求：
只能是以下几种类型：byte,short,int,char四种基本数据类型，
					JDK1.5以后允许支持  枚举类型（引用数据类型）
					JDK1.7以后允许支持  String类型（引用数据类型）
（2）case后面必须是常量值或常量表达式
（3）case后面的常量值的类型必须与switch()中表达式的类型一致或兼容
（4）case后面的常量值不能重复

和if..else:
所有的分支情况，都可以使用if..else，换句话说，可以使用switch..case解决的，一定可以使用if..else。
但是当所有的判断都是常量值的等值判断的话，使用switch..case效率更高，可读性更好。
*/
import java.util.Scanner;

class TestSwitch{
    public static void main(String[] args){
        //根据星期的数字值，输出对应的星期的英文单词
        Scanner input = new Scanner(System.in);
        System.out.print("请输入星期：");
        int week = input.nextInt();

        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("输入有误，星期的范围是1-7");
                break;
        }
    }

}