package com.liaoxuefeng.day11;

/**
 * @Auther: 李将
 * @Date: 2020/6/2 16:54
 * @Descprition:
 */
public class TestExcepthion3 {

    public static void main(String[] args) {

        try {
            Integer.parseInt("sss");
        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
            throw new IllegalArgumentException();
        }


    }
}
