package com.liaoxuefeng.hCollection.aList;


import java.util.LinkedList;

/**
 * @author Alex
 * @since 2020/6/11 16:37
 * <p>
 * LinkList
 * </p>
 */
public class LinkListDemo {

    /**
     * LinkedList 类采用链表结构保存对象，这种结构的优点是便于向集合中插入或者删除元素。需要频繁向集合中插入和删除元素时，使用 LinkedList 类比 ArrayList 类效果高，但是 LinkedList 类随机访问元素的速度则相对较慢。这里的随机访问是指检索集合中特定索引位置的元素。
     * linkedList 也是可以直接使用list接口中的方法，这里需要介绍一下linklist特定的方法
     */
    public static void createLinkList() {

        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("apple");
        linkList.add("banana");
        linkList.add("watermelon");
        linkList.add(0, "pear");
        int i = linkList.indexOf("apple");
        System.out.println("i = " + i);
        String s = linkList.get(i);
        System.out.println(s);
        // 添加为第一个元素
        linkList.addFirst("first");
        // 添加为最后一个元素
        linkList.addLast("last");
        // 获取第一个元素
        String last = linkList.getFirst();
        // 获取最后一个元素
        String last1 = linkList.getLast();
        // 删除第一个元素
        String s1 = linkList.removeFirst();
        // 删除最后一个元素
        String s2 = linkList.removeLast();


    }


    public static void main(String[] args) {

        createLinkList();

    }

}
