package demo.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/10/26 上午10:59
 */
public class MapDemo {

    public static void main(String[] args) {

        Map<String, List<Map<String, String>>> map = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        List<Map<String, String>> list = List.of(map1);
        map.put("key", list);
        List<Map<String, String>> list2 = List.of(map1);
        map.put("key2", list2);
        System.out.println("map = " + map);
        map.entrySet().forEach(e -> {
            System.out.println("e = " + e);
            System.out.println("e.getKey() = " + e.getKey());
            System.out.println("e.getValue() = " + e.getValue());
        });
    }

}
