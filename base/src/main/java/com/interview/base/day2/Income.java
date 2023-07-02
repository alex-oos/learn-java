package day2;


/**
 * @ClassName Income
 * @Description
 * @Author Alex
 * @Date 2022/6/8 7:05
 * @Version 1.0
 */
public abstract class Income {

    public double income;

    public Income(double income) {
        this.income = income;
    }

    public abstract double getMax();

}
