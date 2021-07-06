package cn.leetcode;


import java.util.ArrayList;
import java.util.List;


/**
 * @author: 李将
 * @since: 2020/5/27 14:24
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。s
 * </p>
 */
public class Code3 {

    public static void main(String[] args) {


        Code3 code3 = new Code3();
        int a = code3.lengthOfLongestSubstring("aaaaabb");
        System.out.println("a = " + a);
    }

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            List<Character> characters = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (characters.contains(s.charAt(j))) {
                    break;
                }

                characters.add(s.charAt(j));
                maxLength = Math.max(characters.size(), maxLength);
            }
        }
        return maxLength;

    }

}
