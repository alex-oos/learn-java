package com.liaoxuefeng.day2;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 12:24
 * @Descprition:
 */


/*
 * 继承
 * */
public class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}
