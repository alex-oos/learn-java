package com.liaoxuefeng.hCollection.aList;


import java.util.*;

/**
 * <p>
 * arrayList 的基本用法
 * </p>
 *
 * @author LiJiang
 * @since 2021/6/28 11:47
 */
public class TestArrayList {

    /**
     * Arrays.asList()在平时开发中还是比较常见的，我们可以使用它将一个数组转换为一个List集合。
     */

    public static void function() {
        // 方式一：
        String[] mArray = {"a", "n", "c"};
        List<String> stringList = Arrays.asList(mArray);

        List<String> list = Arrays.asList("Banana", "Apple", "Orange");
        Collections.sort(list);
        // list.clear();
        list.forEach(System.out :: println);
        //方式二：
        List<String> array = new ArrayList<>();

        array.add("c");
        array.add("b");
        //排序
        Collections.sort(array);
        for (String s : array) {
            System.out.println("s = " + s);
        }

        boolean empty = array.isEmpty();
        System.out.println("是否为空：" + empty);

        // 将 lambda 表达式传递给 forEach
        array.forEach((e)->{
            System.out.println("e = " + e);
        });
    }

    public static void b() {

        List<Integer> stringList = new ArrayList<>();
        stringList.add(3);
        stringList.add(1);
        System.out.println("stringList.size() = " + stringList.size());
        Integer s = stringList.get(0);
        // list 中的排序，使用compareTo方法
        stringList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.compareTo(o2);
            }
        });
        // 使用forEach 内置函数
        stringList.forEach(System.out :: println);

        System.out.println("s = " + s);
        stringList.clear();
        stringList.forEach(System.out :: println);
    }

    public static void functionA() {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(0, "banner");
        list.add(1, "apple");
        list.remove(0);
        list.remove("apple");
        String s = list.get(0);
        list.size();
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

        //遍历输出
        list.forEach(System.out :: println);
        // List接口提供的of()方法，根据给定元素快速创建List：
        List<Integer> integerList = new ArrayList<>(List.of(9, 5, 109, 2));

        //排序
        integerList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1.compareTo(o2);
            }
        });

        integerList.forEach(System.out :: println);
        // 使用Iterator 遍历list
        for (Iterator<Integer> integerIterator = integerList.iterator(); integerIterator.hasNext(); ) {
            Integer next = integerIterator.next();
            System.out.println("next = " + next);
        }

        /* 删除list中的所有偶数 */
        integerList.removeIf(filter->filter % 2 == 0);
        integerList.forEach(System.out :: println);

    }

    /**
     * <p>
     * 不能在foreach 中进行remove/add 操作，remove操作，应该使用Iterator使用，如果并发操作，需要对Iterator进行加锁
     * </p>
     */
    public static void functionB() {

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("2".equals(next)) {
                iterator.remove();
            }
        }

        stringList.forEach(System.out :: println);

    }

    public static void main(String[] args) {

        function();
        b();
    }

}
