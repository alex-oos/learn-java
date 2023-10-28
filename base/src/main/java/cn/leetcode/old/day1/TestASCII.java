package cn.leetcode.old.day1;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex
 * @since 2021/7/6 下午 4:23
 * <p>
 * 统计一个字符串中的数字，字母，特殊字符，空格
 * </p>
 */
public class TestASCII {

    private static final StringBuilder sb2 = new StringBuilder();
    //记录中文字符
    private static final StringBuilder sb3 = new StringBuilder();
    //记录英文字符
    private static final StringBuilder sb4 = new StringBuilder();
    /** 英文字符 */

    private static int enCharacter = 0;
    /** 空格 */

    private static int spaceCharacter = 0;
    /** 数字 */

    private static int numberCharacter = 0;
    /** 其他字符 */

    private static int otherCharacter = 0;
    /** 中文字符 */

    private final int chCharacter = 0;

    //记录特殊字符
    private final StringBuilder sb1 = new StringBuilder();

    /**
     * 给一个Str ，Str里面有是asd123*.)),将其分类，并且存到一个list中
     * 1:直接判断，全部以字符识别
     * 2:将读取的单个字符转换成ASCII码进行比较 利用内置函数 oct
     * 3:利用正则表达式 使用re库
     *
     * @param str
     */
    public static void function(String str) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);

            if ((tmp >= 'A' && tmp <= 'Z') || (tmp >= 'a' && tmp <= 'z')) {
                enCharacter++;

                sb2.append(tmp + " ");

            } else if ((tmp >= '0') && (tmp <= '9')) {
                numberCharacter++;

                sb3.append(tmp + " ");

            } else if (tmp == ' ') {
                spaceCharacter++;

            } else {
                otherCharacter++;

                sb4.append(tmp + " ");

            }

        }

        list.add(sb2.toString());
        list.add(sb3.toString());
        list.add(sb4.toString());

        list.forEach(System.out :: println);

    }

    public static void main(String[] args) {

        function("1sadsad3432*^^)(");
    }

}
