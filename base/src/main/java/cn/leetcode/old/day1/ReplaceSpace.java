package cn.leetcode.old.day1;


/**
 * @author: TangKaiZe
 * @since: 2021/7/6 下午 2:59
 * <p>
 * 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * </p>
 */
public class ReplaceSpace {


    /**
     * 第一种方法：常规方法。利用String.charAt(i)以及String.valueOf(char).equals(" "
     * )遍历字符串并判断元素是否为空格。是则替换为"%20",否则不替换
     */
    public static String solution(String string) {

        int length = string.length();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char character = string.charAt(i);
            if (String.valueOf(character).equals(" ")) {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(character);
            }
        }

        return stringBuffer.toString();
    }

    /**
     * 第二种方法：利用API替换掉所用空格，一行代码解决问题
     */

    public static String replaceA(String str) {

        return str.replaceAll(" ", "%20");
    }


    public static void main(String[] args) {

        String a = "I love You";
        String str = solution(a);
        System.out.println("str = " + str);
        String s = replaceA(a);
        System.out.println("s = " + s);
    }


}
