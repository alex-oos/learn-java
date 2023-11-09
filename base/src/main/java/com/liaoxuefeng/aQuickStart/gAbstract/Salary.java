package com.liaoxuefeng.aQuickStart.gAbstract;

/**
 * @author Alex
 * @since 2020/5/28 12:25
 *
 */

/*工资水平*/
public class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income > 5000) {
            return (income - 5000) * 0.2;
        } else {
            return 0;
        }
    }


}
