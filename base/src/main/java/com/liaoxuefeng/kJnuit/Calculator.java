package com.liaoxuefeng.kJnuit;

/**
 * @autoer Alex
 * @since: 2020/7/10 17:56
 * @Descprition:
 */
public class Calculator {
    private long n = 0;

    public long add(long x) {
        n = n + x;
        return x;
    }

    public long sub(long x) {
        n = n - x;
        return n;
    }
}
