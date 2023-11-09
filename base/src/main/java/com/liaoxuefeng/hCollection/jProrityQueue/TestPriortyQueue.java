package com.liaoxuefeng.hCollection.jProrityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Alex
 * @since 2020/6/18 11:36
 *
 */
public class TestPriortyQueue {
    public static void main(String[] args) {
        Queue<User> queue = new PriorityQueue<>(new UserComparator());

        queue.offer(new User("Bob", "A10"));
        queue.offer(new User("Alice", "A2"));
        queue.offer(new User("Boss", "V1"));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}

class UserComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:

            int num1 = Integer.parseInt(u1.number.substring(1));
            int num2 = Integer.parseInt(u2.number.substring(1));
            return Integer.compare(num1, num2);
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}

class User {

    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }


    @Override
    public String toString() {
        return name + "/" + number;
    }
}
