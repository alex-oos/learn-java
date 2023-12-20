package demo.regex;

/**
 * @author: Alex
 * @date: 2023/9/7 下午2:48
 * @Descprition:
 */
public class RegexExp5 {

    public static boolean isPositiveInteger(String str) {
        // 检查字符串是否为空
        if (str == null || str.isEmpty()) {
            return false;
        }

        // 使用正则表达式来匹配正整数
        return str.matches("\\d+"); // 正则表达式 \\d+ 匹配一个或多个数字字符
    }


    public static void main(String[] args) {

        String str1 = "557465803}557465804";
        String str2 = "0";
        String str3 = "-456";
        String str4 = "12a"; // 包含非数字字符

        System.out.println(str1 + " 是正整数: " + isPositiveInteger(str1));
        System.out.println(str2 + " 是正整数: " + isPositiveInteger(str2));
        System.out.println(str3 + " 是正整数: " + isPositiveInteger(str3));
        System.out.println(str4 + " 是正整数: " + isPositiveInteger(str4));
    }

}
