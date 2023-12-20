package demo.streamdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Alex
 * @since 2023/10/11 上午10:34
 * <P></p>
 */
public class StreamDemo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1));
        personList.add(new Person(2));
        personList.add(new Person(3));
        personList.add(new Person(1));

        Map<Integer, Long> collect = personList.stream().collect(Collectors.groupingBy((m -> m.getId()), Collectors.counting()));
        collect.entrySet().stream().filter(entity -> entity.getValue() > 1).forEach(System.out::println);

        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("id", 2);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("id", 1);

        list.add(map);
        list.add(map2);
        list.add(map3);


        // 假设list包含了多个Map对象

        // 使用Stream API分组并筛选
        Map<Object, Long> idCountMap = list.stream().collect(Collectors.groupingBy(m -> m.get("id"), Collectors.counting()));

        // 打印数量大于1的分组
        idCountMap.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println("ID: " + entry.getKey() + "，数量: " + entry.getValue()));

    }

}
