package com.atguigu.day4;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Alex
 * @since 2021/11/16 11:45 上午
 * <P>
 * 从键盘分别输入年、月、日，判断这一天是当年的第几天
 * 注：判断一年是否是闰年的标准：
 * 1）可以被4整除，但不可被100整除
 * 或
 * 2）可以被400整除
 * <p>
 * <p>
 * 说明：
 * 1. 凡是可以使用switch-case的结构，都可以转换为if-else。反之，不成立。
 * 2. 我们写分支结构时，当发现既可以使用switch-case,（同时，switch中表达式的取值情况不太多），
 * 又可以使用if-else时，我们优先选择使用switch-case。原因：switch-case执行效率稍高。
 * </p>
 */
public class TestSwitchCaseExer {

    /**
     * 方案一：
     */
    public static void function() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请按照以下格式输入年月日：XXXX-XX-XX");
        String date = scanner.next();
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 31;
            case 11:
                sumDays += 30;
            case 10:
                sumDays += 31;
            case 9:
                sumDays += 30;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 31;
            case 6:
                sumDays += 30;
            case 5:
                sumDays += 31;
            case 4:
                sumDays += 30;
            case 3:
                sumDays += 31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 1:
                sumDays += day;
        }

        System.out.println(year + "年" + month + "月" + day + "日是当年的第" + sumDays + "天");
    }

    /**
     * 方案二：
     */
    public static void function1() {

        LocalDate today = LocalDate.now();
        int dayOfYear = today.getDayOfYear();
        System.out.println("今天是当年的第 " + dayOfYear + " 天。");


    }

    /**
     * 方案三：
     */
    public static void function2() {

        Instant now = Instant.now();
        LocalDate localDate = now.atZone(ZoneId.systemDefault()).toLocalDate();
        int dayOfYear1 = localDate.getDayOfYear();
        System.out.println("今天是当年的第 " + dayOfYear1 + " 天。");

    }

    /**
     * 方案四：
     */
    public static void function3() {

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        String dayOfYear = dateFormat.format(currentDate);
        System.out.println("今天是当年的第 " + dayOfYear + " 天。");
    }

    /**
     * 方案五：
     */
    public static void function4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请按照以下格式输入年月日：XXXX-XX-XX");

        String date = scanner.next();
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int mouth = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        int[] dayOfMouth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            dayOfMouth[2] = 28;
        }
        int dayOfYear = 0;
        for (int i = 1; i < mouth; i++) {
            dayOfYear += dayOfMouth[i];

        }
        dayOfYear += day;
        System.out.println("今天是当年的第 " + dayOfYear + "天！");

    }

    /**
     * 计算活了多少天
     */
    public static void function5() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的出生年月日：格式为：XXXX-YY-DD");
        String next = scanner.next();
        String[] split = next.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        long daysAlive = ChronoUnit.DAYS.between(birthDate, currentDate);
        System.out.println("出生日期: " + birthDate);
        System.out.println("当前日期: " + currentDate);
        System.out.println("你活了 " + daysAlive + " 天");
    }

    /**
     * 计算活了几年几月几日
     */
    public static void function6() {

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("输入你的出生年月日：格式为：XXXX-YY-DD");
        // String next = scanner.next();
        // String[] split = next.split("-");
        // int year = Integer.parseInt(split[0]);
        // int month = Integer.parseInt(split[1]);
        // int day = Integer.parseInt(split[2]);
        LocalDate birthDate = LocalDate.of(1995, 12, 24);
        LocalDate currentDate = LocalDate.now();
        // 计算年龄差异
        Period period = Period.between(birthDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("出生日期: " + birthDate);
        System.out.println("当前日期: " + currentDate);
        System.out.println("你活了 " + years + " 年 " + months + " 月 " + days + " 天");
    }

    public static void main(String[] args) {

        function();
        function1();
        function2();
        function3();
        function4();
        function5();
        function6();

    }

}
