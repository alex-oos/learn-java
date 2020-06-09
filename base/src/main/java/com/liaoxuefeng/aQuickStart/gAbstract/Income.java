package com.liaoxuefeng.aQuickStart.gAbstract;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 12:24
 * @Descprition:
 */


/*
 * 继承
 * */
public abstract class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public abstract double getTax();


}
