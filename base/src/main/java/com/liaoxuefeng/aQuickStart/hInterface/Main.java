package com.liaoxuefeng.aQuickStart.hInterface;


/**
 * @autoer Alex
 * @since: 2020/5/28 15:54
 * @Descprition:
 */
public class Main {

    public static void main(String[] args) {
        RoyaltyIncome royaltyIncome = new RoyaltyIncome(1);
        double tax = royaltyIncome.getTax();
        System.out.println("tax = " + tax);
        SalaryIncome salaryIncome = new SalaryIncome(2);
        double tax1 = salaryIncome.getTax();
        System.out.println("tax1 = " + tax1);
    }

}
