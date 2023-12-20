package demo.streamdemo;

import com.alibaba.fastjson2.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/10/19 下午5:42
 */
public class ListDemo2 {

    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1", "2");
        jsonObject.put("12", "2");
        List<JSONObject> list = List.of(jsonObject);

        List<Set<String>> collect = list.stream().map(e -> e.keySet()).collect(Collectors.toList());
        collect.forEach(System.out::println);

        collect.forEach(System.out::println);

        List<String> list1 = new ArrayList<>();

        list1.add("");
        list1.add("ListGetTwo");
        List<String> collect1 = list1.stream().filter(e -> !e.equals("")).collect(Collectors.toList());

        collect1.forEach(System.out::println);


    }

}
