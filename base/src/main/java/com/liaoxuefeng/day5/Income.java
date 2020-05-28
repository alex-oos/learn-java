package com.liaoxuefeng.day5;


/**
 * @Auther: 李将
 * @Date: 2020/5/28 16:10
 * @Descprition:
 */
public interface Income {
    double income = 0;

    default double getTax() {
        return income;
    }
}
