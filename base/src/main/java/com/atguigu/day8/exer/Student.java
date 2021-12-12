package com.atguigu.day8.exer;


import java.util.Arrays;
import java.util.Random;

/**
 * @author Alex
 * @date 2021/12/8 3:35 下午
 * 4. 对象数组题目：
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * <p>
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 */
public class Student {

    int number;

    int state;

    int score;


    @Override
    public String toString() {
        return "学号：" + number + ",年级：" + state + ",成绩：" + score;
    }


    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = (i + 1);
            //年级：[1,6]
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //成绩：[0,100]
            stus[i].score = Math.round(100);
        }
        //遍历每个数组的信息
        // System.out.println(Arrays.toString(stus));
      /*  for (Student student : stus) {
            System.out.println(student.toString());
        }*/
        //问题一：打印出3年级(state值为3）的学生信息。
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3) {
                System.out.println(stus[i].toString());
            }
        }
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < stus.length; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    //如果需要换序，交换的是数组的元素：Student对象！！！

                    Student tmp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = tmp;
                }

            }
        }

        System.out.println(Arrays.toString(stus));
        
    }

}
