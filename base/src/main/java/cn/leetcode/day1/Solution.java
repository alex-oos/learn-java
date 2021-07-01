package cn.leetcode.day1;


import javax.naming.InitialContext;
import java.math.BigInteger;

/**
 * @author TangKaiZe
 * @since 2021/7/1 16:27
 * <p>
 * 大数相加，两个String类型的大数相加
 * 以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
 * （字符串长度不大于100000，保证字符串仅由'0'~'9'这10种字符组成）
 * </p>
 */
public class Solution {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     *
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */

    public static String solve(String s, String t) {

        if (s == null || "".equals(s)) {
            return t;
        }
        if (t == null || "".equals(t)) {
            return s;
        }

        int i = s.length() - 1;
        int j = t.length() - 1;
        int m1 = 0, m2 = 0, carry = 0;
        // 最后的数
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                m1 = s.charAt(i) - '0';
            } else {
                m1 = 0;
            }

            if (j >= 0) {
                m2 = t.charAt(j) - '0';
            } else {
                m2 = 0;
            }
            // 进行计算，计算sum
            int sum = m1 + m2 + carry;
            carry = sum / 10;
            // 将数值，追加到string中去
            stringBuilder.append((char) ((sum % 10) + '0'));
            i--;
            j--;

        }
        if (carry != 0) {
            stringBuilder.append("1");
        }
        stringBuilder.reverse();
        return stringBuilder.toString();

    }

    /**
     * 1.保证s是较长的字符串，t是较短的字符串；如果不是，交换之
     * 2.用StrngBuilder保存计算结果，remainder保留进位；逐位计算和，计算到t字符串结束，每次计算和记得加上进位
     * 3.计算s比t多出的字符，同样记得加上进位
     * 4.最后如果进位不为0，结果还要加上进位
     * 5.得到的字符串翻转即是答案
     */
    public static String StringAdd(String s, String t) {

        String tmp;
        if (s.length() < t.length()) {
            tmp = t;
            t = s;
            s = tmp;
        }

        int carry = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            int add = (s.charAt(s.length() - i - 1) - '0') + (t.charAt(t.length() - i - 1) - '0') + carry;
            carry = add > 9 ? 1 : 0;
            res.append(add % 10);
        }
        for (int i = t.length(); i < s.length(); i++) {
            int add = (s.charAt(s.length() - i - 1) - '0') + carry;
            carry = add > 9 ? 1 : 0;
            res.append(add % 10);
        }
        if (carry != 0) {
            res.append(carry);
        }
        res.reverse();

        return res.toString();


    }

    public static void main(String[] args) {

        String s = solve("1", "1");
        System.out.println("s = " + s);
        String s1 = StringAdd("1", "1");
        System.out.println("s1 = " + s1);
    }

}
