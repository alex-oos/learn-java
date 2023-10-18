package com.liaoxuefeng.hCollection.oCollection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @autoer Alex
 * @since: 2020/6/18 20:08
 * @Descprition: Collections 工具类常用方法:
 * <p>
 * 排序
 * 查找,替换操作
 * 同步控制(不推荐，需要线程安全的集合类型时请考虑使用 JUC 包下的并发集合)
 */
public class Main {

    //    Collections 排序
    public static void function() {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
//        排序前
        System.out.println(list);
        //排序
        Collections.sort(list);
        // 排序后
        System.out.println(list);
    }

    // 洗牌
    public static void function1() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // 洗牌前：
        System.out.println(list);
        Collections.shuffle(list);

        //洗牌后
        System.out.println(list);
    }

    // 不可变集合
/*    public static void function2() {
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("pear");
        // 变为不可变集合
        List<String> immutale = Collections.unmodifiableList(mutable);
        immutale.add("orange");
    }*/

    public static void main(String[] args) {
    /*    function();
        function1();*/
/*
        function2();
*/
        function3();

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        function4(list, "apple");
    }

    /*
    * 查找,替换操作
     *  int binarySearch(List list, Object key)//对List进行二分查找，返回索引，注意List必须是有序的
        int max(Collection coll)//根据元素的自然顺序，返回最大的元素。 类比int min(Collection coll)
        int max(Collection coll, Comparator c)//根据定制排序，返回最大元素，排序规则由Comparatator类控制。类比int min(Collection coll, Comparator c)
         void fill(List list, Object obj)//用指定的元素代替指定list中的所有元素
        int frequency(Collection c, Object o)//统计元素出现次数
        int indexOfSubList(List list, List target)//统计target在list中第一次出现的索引，找不到则返回-1，类比int lastIndexOfSubList(List source, list target)
        boolean replaceAll(List list, Object oldVal, Object newVal)//用新元素替换旧元素
     * */
    /*
排序操作
void reverse(List list)//反转
void shuffle(List list)//随机排序
void sort(List list)//按自然排序的升序排序
void sort(List list, Comparator c)//定制排序，由Comparator控制排序逻辑
void swap(List list, int i , int j)//交换两个索引位置的元素
void rotate(List list, int distance)//旋转。当distance为正数时，将list后distance个元素整体移到前面。当distance为负数时，将 list的前distance个元素整体移到后面*/
    public static void function3() {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
        Collections.swap(list, 0, 1);
        System.out.println("list = " + list);
        Collections.rotate(list, 2);
        System.out.println("list = " + list);
    }

    public static void function4(List<String> list, String element) {
        System.out.println("list = " + list);

        int i = Collections.binarySearch(list, element);
        System.out.println("i = " + i);
        String max = Collections.max(list);
        System.out.println("max = " + max);
        Collections.fill(list, "1");
        System.out.println("list = " + list);
        int frequency = Collections.frequency(list, element);
        System.out.println("frequency = " + frequency);
        Collections.replaceAll(list, element, element + "a");
        System.out.println("list = " + list);

    }

}
