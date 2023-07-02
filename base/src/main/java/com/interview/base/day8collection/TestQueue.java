package day8collection;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName TestQueue
 * @Description
 * @Author Alex
 * @Date 2022/6/14 21:33
 * @Version 1.0
 */
public class TestQueue {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("A");
        queue.offer("C");
        queue.offer("B");
        queue.poll();
        System.out.println("queue = " + queue);

        Queue<String> stringQueue = new ArrayDeque<>();

        stringQueue.add("A");
        String remove = stringQueue.remove();
        stringQueue.offer("A");
        System.out.println("stringQueue = " + stringQueue);


    }

}
