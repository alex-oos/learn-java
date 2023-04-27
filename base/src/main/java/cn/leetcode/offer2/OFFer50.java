package cn.leetcode.offer2;


import java.util.HashMap;

/**
 * @ClassName FirstChar
 * @Description 剑指 Offer 50. 第一个只出现一次的字符  https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/solution/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-by-3zqv5/
 * @Author Alex
 * @Date 2022/7/25 20:01
 * @Version 1.0
 */
public class OFFer50 {

    public static char solutionOne(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }


  
    public static void main(String[] args) {
        String str = "asdfghjasdf";

    }

}
