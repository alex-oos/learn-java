package cn.leetcode.old.day3;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Alex
 * @since 2021/7/13 下午 10:00
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断该字符串是否有效。
 * 1.左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 * 比如 "()"、"()[]{}"、"{[]}" 都是有效字符串，而 "(]" 、"([)]" 则不是。
 * </p>
 */
public class TestStack {

    /**
     * 这个问题实际是 Leetcode 的一道题目，我们可以利用栈 Stack 来解决这个问题。
     * 首先我们将括号间的对应规则存放在 Map 中，这一点应该毋容置疑；
     * 创建一个栈。遍历字符串，如果字符是左括号就直接加入stack中，否则将stack 的栈顶元素与这个括号做比较，如果不相等就直接返回 false。遍历结束，如果stack为空，返回 true
     *
     * @return
     */
    public static boolean function(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != map.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("function(\"{[()]}\") = " + function("{[()]}"));
    }

}
