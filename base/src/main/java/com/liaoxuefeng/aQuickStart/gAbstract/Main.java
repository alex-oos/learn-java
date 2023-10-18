package com.liaoxuefeng.aQuickStart.gAbstract;

/**
 * @autoer Alex
 * @since: 2020/5/28 12:29
 * @Descprition:
 */

/*方法入口*/
/*    抽象类只提供一个脚手架的功能需要:
            1.方法定义抽象需要abstract,同时类也要加上abstract
            2.该类不能实例化
            3、抽象类可以定义构造函数，构造函数建议写在变量后面
            */
public class Main {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}
