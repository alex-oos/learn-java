package learning;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {


    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();

        map1.put("name", "Host");
        map1.put("value", "www.baidu.com");

        Map<String, String> map2 = new HashMap<>();

        map2.put("name", "appleId");
        map2.put("value", "116");

        Map<String, String> map3 = new HashMap<>();

        map3.put("name", "User-Agent");
        map3.put("value", "IIE7");

        list.add(map1);
        list.add(map2);
        list.add(map3);

        Map<String, String> map = new HashMap<>();

        list.forEach(tmp->{
            map.put(tmp.get("name"), tmp.get("value"));
        });
        System.out.println("map = " + map);


    }

}
