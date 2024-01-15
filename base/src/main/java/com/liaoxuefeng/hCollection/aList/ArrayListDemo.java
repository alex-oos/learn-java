package com.liaoxuefeng.hCollection.aList;


import java.util.*;

/**
 * <p>
 * List 中的基本用法
 * </p>
 *
 * @author Alex
 * @since 2023/12/2 11:47
 */
public class ArrayListDemo {

    /**
     * ArrayList 类实现了可变数组的大小，存储在内的数据称为元素。它还提供了快速基于索引访问元素的方式，对尾部成员的增加和删除支持较好。使用 ArrayList 创建的集合，···，不过，向 ArrayList
     *|
     * 中插入与删除元素的速度相对较慢。
     */

    /**
     * 创建list的三种方式：
     * 方式一：
     * 方式二：
     * 方式三：
     */

    public static void createList() {
        // 方式一：
        String[] mArray = {"a", "n", "c"};
        List<String> stringList = Arrays.asList(mArray);
        // 方式二：
        List<String> stringList2 = new ArrayList<>();
        stringList2.add("c");
        stringList2.add("b");
        // 方式三：
        List<String> stringList3 = new ArrayList<>(List.of("a", "b", "c", "d"));

    }

    /**
     * list 中常用的一些方法：ArrayList LinkList 通用
     * 1. add 方法，添加元素
     * 2. get 方法，获取元素
     */
    public static void listMethods() {

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");  // 添加元素，默认在list末尾添加
        fruitList.add(0, "banana"); // 指定位置添加元素，将其他元素挤走
        fruitList.add(1, "apple");
        fruitList.add("strawberry");
        fruitList.add("tangerine");
        // 查找元素，方式一：使用get方法
        String s = fruitList.get(0);// 获取元素
        // 查找元素第一次返回的索引值
        int i = fruitList.indexOf("banner");
        // 返回最后一次出现的索引值
        int i1 = fruitList.lastIndexOf("apple");
        // 截取元素,截取出来仍然是一个list
        List<String> list = fruitList.subList(0, fruitList.size() - 2);
        // 修改值，修改指定位置的元素为XX
        String set = fruitList.set(0, "watermelon");
        System.out.println(s);
        System.out.println("list = " + fruitList);
        System.out.println("list.size() = " + fruitList.size()); // 查看list的长度

        // 排序的三种方式：
        // 方式一：使用sort方法传入Comparator（）
        fruitList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2);
            }
        });
        // 方式二：用lamada表达式来编写
        fruitList.sort(String::compareTo);
        // 方式三：使用 Collections.sort()方法
        Collections.sort(fruitList);

        // 当list中包含tangerine 元素的时候直接删除
        fruitList.remove(0);  // 删除指定索引元素
        fruitList.remove("apple"); // 删除list中的元素
        fruitList.removeIf(filter -> filter == "tangerine");
        // 清空list中的所有元素
        fruitList.clear();

    }


    /**
     * list 遍历的几种方式：
     */
    public static void traverseList() {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // 方式一：使用for循环，取索引值
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 方式二：使用 foreach
        for (Integer i : list) {
            System.out.println(i);
        }

        // 方式三： 使用 lamada表达式
        list.forEach(System.out::println);
        // 方式四： 使用迭代器 使用Iterator 遍历list
        for (Iterator<Integer> integerIterator = list.iterator(); integerIterator.hasNext(); ) {
            Integer next = integerIterator.next();
            System.out.println("next = " + next);
        }

    }


    public static void main(String[] args) {

        createList();
        listMethods();
        traverseList();


    }

}
