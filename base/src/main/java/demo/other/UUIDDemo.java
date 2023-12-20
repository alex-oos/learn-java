package demo.other;

import java.util.UUID;

/**
 * <P>
 * UUID 使用demo
 * </p>
 *
 * @author Alex
 * @since 2023/10/16 上午10:29
 */
public class UUIDDemo {

    public static void main(String[] args) {

        long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
        System.out.println("mostSignificantBits = " + mostSignificantBits);

        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
        System.out.println("leastSignificantBits = " + leastSignificantBits);

        System.out.println(UUID.randomUUID());
    }

}
