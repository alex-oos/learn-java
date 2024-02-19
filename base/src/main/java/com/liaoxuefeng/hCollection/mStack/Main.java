package com.liaoxuefeng.hCollection.mStack;


import java.util.Stack;

/**
 * @ClassName Main
 * @Description 栈是Vector的一个子类，它实现了一个标准的后进先出的栈
 * @Author Alex
 * @since 2022/6/14 23:26
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        // 把项压入堆栈顶部。
        stack.push("A");
        stack.push("A");
        stack.push("B");

        System.out.println("stack = " + stack);
        // 移除堆栈顶部的对象，并作为此函数的值返回该对象。
        String pop = stack.pop();
        System.out.println("pop = " + pop);
        System.out.println("stack = " + stack);
        // 查看堆栈顶部的对象，但不从堆栈中移除它。
        String peek = stack.peek();
        System.out.println("peek = " + peek);
        // 返回对象在堆栈中的位置，以 1 为基数。 如果对象是堆栈中的一个项，则返回到堆栈顶部的距离；堆栈中最靠近顶部的项距离为 1。使用 equals 方法比较 item。
        int a = stack.search("A");
        System.out.println("a = " + a);
        // 测试堆栈是否为空。
        boolean empty = stack.isEmpty();
        System.out.println("empty = " + empty);


    }

}
