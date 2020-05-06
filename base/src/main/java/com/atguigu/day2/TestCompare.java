package com.atguigu.day2;

/*
三、比较运算符，也称为关系运算符
大于：>
小于：<
大于等于：>=
小于等于：<=
等于：==   注意区分赋值的=
不等于：!=

>=,<=,==,!=中间不能有空格

关系运算符的表达式的结果只有两种：true/false
*/
class TestCompare {
    public static void main(String[] args) {
        int teaAge = 18;
        int stuAge = 23;

        boolean result = teaAge < stuAge;
        System.out.println("老师的年龄是否比你的年龄小？" + result);

        boolean flag = false;
		/*
		if(flag = true){//这里是赋值运算符   flag=true
			System.out.println("柴老师是大美女");
		}else{
			System.out.println("柴老师是大大美女");
		}
		*/

		/*
		if(flag == true){//这里是赋值运算符   flag=true
			System.out.println("柴老师是大美女");
		}else{
			System.out.println("柴老师是大大美女");
		}
		*/

        if (flag != false) {//当flag是true时，if才成立  flag!=false的结果采为true
            System.out.println("柴老师是大美女");
        } else {
            System.out.println("柴老师是大大美女");
        }

        int age = 18;
        System.out.println(age != 18);//false
        System.out.println(age == 18);
        System.out.println(age = 18);
    }
}