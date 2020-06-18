package com.liaoxuefeng.hCollection.hQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Auther: 李将
 * @Date: 2020/6/16 下午 11:28
 * @Descprition:
 */
public class Main {
    public static void function() {
        Queue<String> q = new LinkedList<>();

        //调用add()方法，当添加失败时（可能超过了队列的容量），它会抛出异常：
        q.add("apple");
        //offer()方法来添加元素，当添加失败时，它不会抛异常，而是返回false：
        q.offer("banane");
        q.offer("pear");

        //Queue中取出队首元素时，如果当前Queue是一个空队列，调用remove()方法，它会抛出异常：
        System.out.println("q.pull() = " + q.remove());
        //poll()方法来取出队首元素，当获取失败时，它不会抛异常，而是返回null：
        System.out.println("q.poll(\"banane\") = " + q.poll());

        System.out.println("q = " + q.poll());

        System.out.println("q.poll() = " + q.poll());
    }


    public static void main(String[] args) {
        function();
    }
}
