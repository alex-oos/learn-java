package com.liaoxuefeng.hCollection.cMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 李将
 * @since: 2020/6/10 21:19
 * @Descprition:
 */
public class Main {

    //用Map来实现根据name查询某个Student的代码如下：
    public static void f() {
        Student student = new Student("xiao ming", 99);
        Map<String, Student> map = new HashMap<>();
        map.put("xiao ming", student); // 将"Xiao Ming"和Student实例映射并关联
        Student target = map.get("xiao ming"); // 通过key查找并返回映射的Student实例
        System.out.println(target == student);  // true，同一个实例
        System.out.println("target.getScore() = " + target.getScore()); // 99
        Student annother = map.get("Bob"); // 通过另一个key查找
        System.out.println("annother = " + annother); // 未找到返回null
    }

    // map 中key不能重复，但是value是可以的
    // Map中不存在重复的key，因为放入相同的key，只会把原有的key-value对应的value给替换掉。
    public static void f1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        System.out.println("map.get(\"apple\") = " + map.get("apple"));
        map.put("apple", 789);  // 再次放入apple作为key，但value变为789
        System.out.println("map.get(\"apple\") = " + map.get("apple"));


    }

    //遍历Map
    //对Map来说，要遍历key可以使用for each循环遍历Map实例的keySet()方法返回的Set集合，它包含不重复的key的集合：
    public static void f2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 123);
        map.put("pear", 456);
        map.put("banana", 789);

        // for each 使用 Map实例的keySet()遍历出
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " = " + value);
        }
        // for each 使用 Map的entrySet()集合，它包含每一个key-value映射：
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }


    public static void f3() {
        List<Student> list = List.of(
                new Student("Bob", 78),
                new Student("Alice", 85),
                new Student("Branch", 85),
                new Student("Newton", 85)

        );
        var holder = new Students(list);
        System.out.println(holder.getScore("Bob") == 78 ? "测试成功" : "测试失败");
        System.out.println(holder.getScore("Alice") == 105 ? "测试成功" : "测试失败");
        System.out.println(holder.getScore("Tom") == -1 ? "测试成功!" : "测试失败!");
    }

    public static void f4() {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student("liuyan", 100), 1);


    }

    public static void main(String[] args) {
//        f1();
        f2();
//        f3();
    }
}
