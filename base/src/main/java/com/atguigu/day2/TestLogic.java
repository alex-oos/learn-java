package com.atguigu.day2;


/**
 * @Auther: 唐凯泽
 * @Date: 2020/5/6 20:49
 * @Descprition:
 */
/*
四、逻辑运算符
1、逻辑与：&
	左右两个的结果都为true，表达式的结果才为true
	true & true 结果为true
	false & true 结果为false
	true & false 结果为false
	false & false 结果为false
2、逻辑或：|
	左右两个的结果，有一个是true，表达式的结果就为true
	true | true 结果为true
	false | true 结果为true
	true | false 结果为true
	false | false 结果为false
3、逻辑非：!
	!true 结果为false
	!false 结果为true

4、逻辑异或：^
	左右两边是不一样，结果就为true，同为false,异为true
	true ^ true 结果为false
	false ^ true 结果为true
	true ^ false 结果为true
	false ^ false 结果为false
5、短路与：&&
	首先，也是要两个都为true，结果采为true
	true && true 结果为true
	false && true 结果为false
	true && false 结果为false
	false && false 结果为false
	和逻辑与&不同的时，&&的效率高。
	高在，如果左边的是false,右边的就不用计算了，因为结果已经可以确定为false。
6、短路或：||
	首先，也是一边为true，结果就为true
	true || true 结果为true
	false || true 结果为true
	true || false 结果为true
	false || false 结果为false
	和逻辑或|不同的是，||的效率高。
	高在，如果左边的是true，右边的就不用看了，因为结果已经可以确定为true
*/
public class TestLogic {
    public static void main(String[] args) {
        int age = 17;

        if (18 <= age & age <= 35) {
            System.out.println("欢迎来尚硅谷学习");
        }

        System.out.println(true & true);

        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & false);


        if (age < 18 | age > 35) {
            System.out.println("年龄过大或过小");
        }
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | false);

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
        System.out.println(false ^ false);//false


        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        	/*
		int i = 1;
		int j= 2;
		//左边：i==1，然后i++，成立，true, i=2
		//右边：j==2，然后j++，成立，true，j=3
		//true && true
		if(i++ == 1 && j++ == 2){
			System.out.println("haha");
		}else{
			System.out.println("hehe");
		}
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		*/

        int i = 2;
        int j = 2;

        //左边：i==1,i++，false，i=3
        //因为左边是false，所以右边就不看了，因为中间是&&短路与
        if (i++ == 1 && j++ == 2) {
            System.out.println("haha");
        } else {
            System.out.println("hehe");
        }
        System.out.println("i=" + i);//3
        System.out.println("j=" + j);//2
    }

}
