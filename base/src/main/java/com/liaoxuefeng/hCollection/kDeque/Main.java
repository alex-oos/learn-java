package com.liaoxuefeng.hCollection.kDeque;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Auther: 李将
 * @Date: 2020/6/18 11:57
 * @Descprition: Deque: 双端队列，允许两头都进，两头都出
 * Deque 队列，功能是：
 * 1、既可以添加到队尾，可以添加到队首
 * 2、既可以从队首获取，又可以从队尾获取
 */
public class Main {

    public static void function() {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerFirst("C");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());

    }

    public static void main(String[] args) {
        function();
    }
}

/*
* eque实现了一个双端队列（Double Ended Queue），它可以：

将元素添加到队尾或队首：addLast()/offerLast()/addFirst()/offerFirst()；
从队首／队尾获取元素并删除：removeFirst()/pollFirst()/removeLast()/pollLast()；
从队首／队尾获取元素但不删除：getFirst()/peekFirst()/getLast()/peekLast()；
总是调用xxxFirst()/xxxLast()以便与Queue的方法区分开；
避免把null添加到队列。
* */
