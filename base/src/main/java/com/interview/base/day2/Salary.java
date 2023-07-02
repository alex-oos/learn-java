package day2;


/**
 * @ClassName Salary
 * @Description
 * @Author Alex
 * @Date 2022/6/8 7:07
 * @Version 1.0
 */
public class Salary extends Income{

    public Salary(double income) {
        super(income);
    }
    /**
     * @return
     */
    @Override
    public double getMax() {
        return 0;
    }

}
