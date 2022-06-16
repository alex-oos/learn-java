package com.liaoxuefeng.hCollection.cMap;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestMain
 * @Description
 * @Author Alex
 * @Date 2022/6/16 21:51
 * @Version 1.0
 */
public class TestMain {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        // 键不能重复，值可以重复
        map.put("san", "张三");
        map.put("si", "李四");
        map.put("wu", "王五");
        map.put("wang", "老王");
        map.put("wang", "老王2");// 老王被覆盖
        map.put("lao", "老王");
        System.out.println("-------直接输出hashmap:-------");
        System.out.println(map);

        /**
         * 遍历HashMap
         */
        // 1.获取Map中的所有键
        System.out.println("-------foreach获取Map中所有的键:------");

        for (String key : map.keySet()) {
            System.out.print("key = " + key);
        }
        System.out.println();
        // 2.获取Map中所有值
        System.out.println("-------foreach获取Map中所有的值:------");

        for (String value : map.values()) {
            System.out.print("value = " + value);
        }

        System.out.println();
        // 3.得到key的值的同时得到key所对应的值
        for (String key : map.keySet()) {
            System.out.print(key + ":" + map.get(key));
        }

        /**
         * 如果既要遍历key又要value，那么建议这种方式，因为如果先获取keySet然后再执行map.get(key)，map内部会执行两次遍历。
         * 一次是在获取keySet的时候，一次是在遍历所有key的时候。
         */
        // 当我调用put(key,value)方法的时候，首先会把key和value封装到
        // Entry这个静态内部类对象中，把Entry对象再添加到数组中，所以我们想获取
        // map中的所有键值对，我们只要获取数组中的所有Entry对象，接下来
        // 调用Entry对象中的getKey()和getValue()方法就能获取键值对了

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println();
        /**
         * HashMap其他常用方法
         */
        System.out.println("after map.size()：" + map.size());
        System.out.println("after map.isEmpty()：" + map.isEmpty());
        System.out.println(map.remove("san"));
        System.out.println("after map.remove()：" + map);
        System.out.println("after map.get(si)：" + map.get("si"));
        System.out.println("after map.containsKey(si)：" + map.containsKey("si"));
        System.out.println("after containsValue(李四)：" + map.containsValue("李四"));
        System.out.println(map.replace("si", "李四2"));
        System.out.println("after map.replace(si, 李四2):" + map);
    }


}
