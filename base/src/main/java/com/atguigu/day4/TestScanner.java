package com.atguigu.day4;


import java.util.Scanner;

/**
 * @author Alex
 * @since 2021/11/16 11:35 上午
 * <P>
 * 如何从键盘获取不同类型的变量：需要使用Scanner类
 * 具体实现步骤：
 * 1.导包：import java.util.Scanner;
 * 2.Scanner的实例化:Scanner scan = new Scanner(System.in);
 * 3.调用Scanner类的相关方法（next() / nextXxx()），来获取指定类型的变量
 * <p>
 * 注意：
 * 需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchException
 * 导致程序终止。
 * </p>
 */
// 1、导包：import java.util.Scanner
public class TestScanner {

    public static void main(String[] args) {

        // 2、scanner 的实例化
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的姓名：");

        String name = scanner.next();
        System.out.println("name = " + name);

        System.out.println("请输入你的芳龄：");
        int age = scanner.nextInt();
        System.out.println("age = " + age);

        System.out.println("请输入你的体重");
        double weight = scanner.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中了我呢？（true/false）");
        boolean isLove = scanner.nextBoolean();
        System.out.println(isLove);

        System.out.println("请输入你的性别：（男或女）");
        String gender = scanner.next();
        char genderChar = gender.charAt(0);
        System.out.println("genderChar = " + genderChar);

    }


}
