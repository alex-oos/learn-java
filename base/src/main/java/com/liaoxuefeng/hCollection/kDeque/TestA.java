package com.liaoxuefeng.hCollection.kDeque;


import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Alex
 * @since 2020/6/18 12:08
 *  栈
 */
public class TestA {

    public static void main(String[] args) {
        function();
    }
    /*
     * 栈（Stack） 是一种现后进后出的数组结构
     * */
    public static void function() {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }

    }
    static String toHex(int n) {
        Deque<String> deque = new LinkedList<>();
        String result = "";
        int remain = n;
        while (n < 16) {
            remain = n % 16;
            deque.push(Integer.toHexString(remain));
            n = n / 16;
        }
        deque.push(Integer.toHexString(n));
        while (!deque.isEmpty()) {
            result += deque.pop();
        }
        return result;

    }

}
