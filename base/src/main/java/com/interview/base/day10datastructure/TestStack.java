package day10datastructure;


import java.util.Stack;

/**
 * @ClassName TestStack
 * @Description
 * @Author Alex
 * @Date 2022/6/18 15:52
 * @Version 1.0
 */
public class TestStack {

    public static String function(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder outputString = new StringBuilder();
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            outputString.append(pop);
        }
        return outputString.toString();

    }

    public static void main(String[] args) {
        String abcd = function("ABCD");
        System.out.println("abcd = " + abcd);
    }

}
