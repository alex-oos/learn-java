package cn.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author: TangKaiZe
 * @since: 2021/7/8 下午 7:29
 * <p>
 * </p>
 */
public class aa {

    static List<String> list = new ArrayList<>();

    public static String function(String str) {
        /**
         * 、给定一字符串，尽可能多的切分出子串，切分要求：后面的子串不能包含前子串的元素；
         * 例子：abcafgdguioo   -> [abca f gdg u i oo]
         */
        if (str.length() <= 0) {
            return "";
        }
        for (char o : str.toCharArray()) {
            for (int i = 0; i < str.length(); i++) {
                if (o == str.charAt(i)) {
                    str.substring(str.indexOf(o), i);
                    System.out.println("str.substring(str.indexOf(o), i) = " + str.substring(str.indexOf(o), i + 1));
                }
            }
        }
        return "";
    }

    public static String aa(int begin, int end, String str) {

        for (int i = begin; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    list.add(str.substring(i, j + 1));
//                    System.out.println("list = " + list.toString());

                    return aa(j, str.length(), str);
                }


            }
            if (i > 0 && i + 1 < str.length()) {
                list.add(String.valueOf(str.charAt(i + 1)));

            }
//            System.out.println("list = " + list.toString());
        }
        return list.toString();
    }


    public static void main(String[] args) {

        String str = "abcafgdguioo";
        String str_a = aa(0, str.length(), str);
        System.out.println("str_a = " + str_a);

        String substring = str.substring(0, 1);
    }

}
