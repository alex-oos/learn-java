package day5;


/**
 * @ClassName Conduction
 * @Description
 * @Author Alex
 * @Date 2022/6/12 22:25
 * @Version 1.0
 */
public class Conduction {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        swap(num1, num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    /**
     * 传递基本类型参数
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
