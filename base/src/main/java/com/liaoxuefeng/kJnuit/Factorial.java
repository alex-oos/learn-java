package com.liaoxuefeng.kJnuit;

/**
 * @author Alex
 * @since 2020/7/10 10:40
 *
 */
public class Factorial {

    public static long fact(long n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;

        }
        return r;
    }


}
