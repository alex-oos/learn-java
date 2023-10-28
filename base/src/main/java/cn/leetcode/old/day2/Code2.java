package cn.leetcode.old.day2;


/**
 * @author Alex
 * @since 2021/7/8 下午 4:48
 * <p>
 * </p>
 */
public class Code2 {

    public static int function(String s) {

        int count1 = 0;
        int count2 = 0;
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar == '{') {
                count1++;
            } else if (aChar == '}') {
                count2++;
            }
        }

        return count1 > count2 ? count2 : count1;
    }

    public static void main(String[] args) {

        int space = function("{{{}}}}}}");
        System.out.println("function = " + space);
    }

}
