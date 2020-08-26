package com.atguigu.day3;

/**
 * @author: 李将
 * @since: 2020/5/8 上午 12:02
 * @Descprition:
 */
/*
五、多分支结构
语法结构：
if(条件表达式1){
	当条件表达式1成立，执行语句块1;
}else if(条件表达式2){
	当条件表达式2成立，执行语句块2;
}【else if(条件表达式3){
	当条件表达式2成立，执行语句块3;
}】
....
【else{
	当以上所有的条件表达式都不成立，执行语句块n+1;
}
】

执行特点：
（1）先判断条件表达式1，如果条件表达式1成立，那么就执行语句块1，后面的分支统统都不看，也不执行
（2）如果条件表达式1不成立，接着看条件表达式2，如果条件表达式2成立，那么就执行语句块2，
	前面的语句块1，和后面的语句块都不执行，后面的条件也不看了。
（3）依次类推
（4）如果所有的条件都不成立，如果此时存在单独的else，那么执行else中的语句块n+1，如果else不存在，那么就都不执行。

说明：
（1）【】表示可选，可能有可能没有
（2）所有的条件表达式都要是布尔值
（3）所有的分支，如果只有一个语句，对应的{}仍然可以省略，但是强烈建议都保留。
（4）如果多个if的条件的范围是互斥，没有重叠部分，那么是顺序可以调换
	如果多个if的条件的范围是包含，有重叠部分，那么顺序有要求，范围小的在上，大的在下

*/
import java.util.Scanner;

class TestIfElseIf{
    public static void main(String[] args){
        //例子：从键盘输入一个成绩
        //假设成绩输入都是合理的[0,100]
        //如果是100分，那么就打印满分
        //如果是[80,99]，那么就打印优秀
        //如果是[70,80)，那么就打印良好
        //如果是[60,70)，那么就打印及格
        //否则都不及格
        Scanner input = new Scanner(System.in);

        System.out.print("请输入成绩：");//提示输入
        //接收键盘输入
        int score = input.nextInt();

        //判断
		/*
		if(score == 100){
			System.out.println("满分");
		}else if(score>=80 && score<=99){
			System.out.println("优秀");
		}else if(score>=70 && score<80){
			System.out.println("良好");
		}else if(score>=60 && score<70){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		//条件互斥：每一个条件没有重叠部分
		*/

        //前提仍然是成绩在[0-100]
        if(score == 100){
            System.out.println("满分");
        }else if(score>=80){
            System.out.println("优秀");
        }else if(score>=70){
            System.out.println("良好");
        }else if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        //条件包含：仅看条件的范围是有重叠和包含部分

    }
}
