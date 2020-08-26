package com.liaoxuefeng.hCollection.hQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: 李将
 * @since: 2020/6/16 下午 11:28
 * @Descprition: 列（Queue）是一种经常使用的集合。Queue实际上是实现了一个先进先出（FIFO：First In First Out）的有序表。它和List的区别在于，List可以在任意位置添加和删除元素，而Queue只有两个操作：
 * <p>
 * 把元素添加到队列末尾；
 * 从队列头部取出元素。
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

    //如果用peek()，因为获取队首元素时，并不会从队列中删除这个元素，所以可以反复获取：
    public static void function1() {

        Queue<String> queue = new LinkedList<>();
        queue.offer("apple");
        queue.offer("pear");
        queue.offer("bannana");

        //从队首获取元素但不删除。
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.element() = " + queue.element());

    }


    public static void main(String[] args) {
        function();
        function1();
    }
}
