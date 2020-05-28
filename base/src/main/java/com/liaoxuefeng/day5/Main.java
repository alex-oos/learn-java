package com.liaoxuefeng.day5;

/**
 * @Auther: 李将
 * @Date: 2020/5/28 15:42
 * @Descprition:
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Student("小明");
        p.run();

        Income[] incomes = new Income[]{
                new RoyaltyIncome(10000),
                new SalaryIncome(7000)
        };

        System.out.println("incomes = " + totalTax(incomes));

    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }

}
