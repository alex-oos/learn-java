package com.liaoxuefeng.cExcethion;

/**
 * @author Alex
 * @since 2020/6/2 16:27
 * @Descprition:
 */
public class TestException {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            //通过printStackTrace()可以打印出方法的调用栈
            e.printStackTrace();
        }
    }

    static void process1() {
        process2();
    }


    static void process2() {
        Integer.parseInt(null); // 会抛出NumberFormatException


    }


}
