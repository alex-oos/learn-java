package com.liaoxuefeng.hCollection.jProrityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Auther: 李将
 * @Date: 2020/6/18 11:24
 * @Descprition:
 */
public class Main {
    /*
    * 优先队列：PriorityQueue。

PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，对PriorityQueue调用remove()或poll()方法，返回的总是优先级最高的元素。

要使用PriorityQueue，我们就必须给每个元素定义“优先级”。我们以实际代码为例，先看看PriorityQueue的行为
* */

    public static void function() {

        Queue<String> queue = new PriorityQueue<>();
//        添加元素到队列
        queue.offer("apple");
        queue.offer("pear");
        queue.offer("bannana");
        // 取出队列中的每一个元素

        System.out.println("queue = " + queue.poll());
        System.out.println("queue= " + queue.poll());
        System.out.println("queue = " + queue.poll());
        System.out.println("queue = " + queue.poll());

    }

    public static void main(String[] args) {
        function();
    }
}
