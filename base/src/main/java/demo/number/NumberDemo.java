package demo.number;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/9 下午3:36
 */
public class NumberDemo {

    public static void main(String[] args) {

        String a = "9223372036854775808";
        System.out.println(a);
        long maxValue1 = Long.MAX_VALUE;
        System.out.println(maxValue1);
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        if (Integer.MAX_VALUE > Integer.parseInt(a)) {
            System.out.println("a = " + a);
        }
    }

}
