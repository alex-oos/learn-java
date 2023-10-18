package com.liaoxuefeng.aQuickStart.hInterface;


/**
 * @autoer Alex
 * @since: 2020/5/28 16:10
 * @Descprition:
 */
public interface Income {
    double income = 0;

    default double getTax() {
        return income;
    }
}
