package day8collection;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TestMap
 * @Description
 * @Author Alex
 * @Date 2022/6/14 21:33
 * @Version 1.0
 */
public class TestMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        for (String s : map.keySet()) {
            System.out.println(s + ":" + map.get(s));
        }

        Iterable iterable = map.entrySet();

        map.remove("key1");
        map.forEach((k, v)->{
            System.out.println(k + ":" + v);
        });


        boolean empty = map.isEmpty();
        System.out.println("empty = " + empty);

        boolean key = map.containsKey("key");
        System.out.println("key = " + key);

        map.clear();
        System.out.println("map = " + map);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("key1", "value");
        treeMap.put("aa", "Sada");

        System.out.println("treeMap = " + treeMap);


    }

}
