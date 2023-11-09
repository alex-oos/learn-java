package com.liaoxuefeng.aQuickStart.hInterface;

/**
 * @author Alex
 * @since 2020/5/28 16:11
 * 
 */

public class SalaryIncome implements Income {
    double income;

    public SalaryIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        if (income < 5000) {
            return 0;
        } else
            return (income - 5000) * 0.2;
    }
}
