package com.interview.base.day10datastructure;


import java.util.Stack;

/**
 * @ClassName TestStack
 * @Description
 * @Author Alex
 * @Version 1.0
 * @since 2022/6/18 15:52
 */
public class TestStack {

    // 使用栈实现字符串的倒序输出
    public static String function(String str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            // 依次将字符串中的字符压入栈中
            stack.push(str.charAt(i));
        }

        StringBuilder outputString = new StringBuilder();
        while (!stack.isEmpty()) {
            // 依次将栈中的字符弹出
            Character pop = stack.pop();
            outputString.append(pop);
        }
        return outputString.toString();

    }

    public static void main(String[] args) {

        String abcd = function("ABCD");
        System.out.println("倒序输出：" + abcd);
    }

}
