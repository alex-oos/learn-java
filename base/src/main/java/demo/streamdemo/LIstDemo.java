package demo.streamdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Alex
 * @since 2023/10/11 下午3:38
 * <P></p>
 */
public class LIstDemo {

    public static void main(String[] args) {

        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "a");
        map.put("key2", "b");
        map.put("key3", "c");
        list.add(map);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("key1", "d");
        map2.put("key2", "e");
        map2.put("key3", "f");

        list.add(map2);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("key1", "g");
        map3.put("key2", "h");
        map3.put("key3", "i");
        list.add(map3);

        Map<Object, Map<Object, Map<Object, Long>>> collect = list.stream().collect(Collectors.groupingBy(e -> e.get("key1"), Collectors.groupingBy(e -> e.get("key2"), Collectors.groupingBy(e -> e.get("key3"), Collectors.counting()))));

        // System.out.println(collect);

        // collect.forEach((k1, v1) -> {
        //     System.out.println("k1 = " + k1);
        //     v1.forEach((k2, v2) -> {
        //         System.out.println("k2 = " + v2);
        //         v2.forEach((k3, v3) -> {
        //             System.out.println(k3 + ":" + v3);
        //         });
        //
        //
        //     });
        // });


        // Map<Object, Long> key1 = list.stream().collect(Collectors.groupingBy(e -> e.get("key1"), Collectors.counting()));
        // key1.forEach((k, v) -> System.out.println(k + ":" + String.valueOf(v)));
        Map<Object, List<Map<String, Object>>> key11 = list.stream().collect(Collectors.groupingBy(e -> e.get("key1")));
        // System.out.println("key11 = " + key11);
        // System.out.println("key11.values() = " + key11.values());

        Stream<List<Map<String, Object>>> listStream = key11.values().stream().filter(e -> e.size() == 1);
        List<Map<String, Object>> mapList = new ArrayList<>();
        listStream.forEach(e -> {
            e.forEach(f -> {
                if (!f.get("key1").equals("a")) {
                    mapList.add(f);
                }
            });
        });

        mapList.forEach(System.out::println);

    }

}
