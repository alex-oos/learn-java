package com.liaoxuefeng.cExcethion;

/**
 * @autoer Alex
 * @since: 2020/6/2 16:54
 * @Descprition:
 */
public class TestExcepthion3 {

    public static void main(String[] args) {

        try {
            int i = Integer.parseInt("sss");
            System.out.println(i);
        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
            // throw new IllegalArgumentException();
        }


    }

}
