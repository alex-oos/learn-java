package day5;


/**
 * @ClassName Conduction1
 * @Description
 * @Author Alex
 * @Date 2022/6/12 22:32
 * @Version 1.0
 */
public class Conduction1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array[0] = " + array[0]);
        change(array);
        System.out.println("array[0] = " + array[0]);


    }

    public static void change(int[] array) {
        array[0] = 0;
    }

}
