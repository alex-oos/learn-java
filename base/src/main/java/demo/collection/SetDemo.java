package demo.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/9 上午11:20
 */
public class SetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("1");
        set.removeIf(e -> e.equals("1"));
        set.forEach(System.out::println);
    }

}
