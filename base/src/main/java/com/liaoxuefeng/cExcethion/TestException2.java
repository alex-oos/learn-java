package com.liaoxuefeng.cExcethion;

/**
 * @author Alex
 * @since 2020/6/2 16:42
 * 
 */
public class TestException2 {

    public static void main(String[] args) {

        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            // 打印出堆栈异常信息
            throw new IllegalArgumentException(e);
        }
    }

    public static void process2() {
        throw new NullPointerException();
    }

}
