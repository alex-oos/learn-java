package day2;


/**
 * @ClassName Main
 * @Description
 * @Author Alex
 * @Date 2022/6/8 7:08
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Salary salary = new Salary(1);
        double max = salary.getMax();
        System.out.println("max = " + max);
    }

}
