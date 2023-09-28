package com.liaoxuefeng.cExcethion;

/**
 * @author: 李将
 * @since: 2020/6/2 17:05
 * @Descprition:
 */
public class TestExcepthion4 {

    public static void main(String[] args) throws Exception {

        Exception origin = null;
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
            Exception e = new IllegalArgumentException();
            if (origin != null) {
                e.addSuppressed(origin);
            }
            throw e;
        }

    }

}
