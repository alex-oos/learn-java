package demo.regex;

import java.util.Scanner;

/**
 * @author: Alex
 * @date: 2023/9/8 上午10:30
 * @Descprition:
 */
public class RegexExp2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.contains("|")) {
            String[] split = s.split("\\|");
            for (String s1 : split) {
                boolean matches = s1.matches("^[0-1]");
                System.out.println("matches = " + matches);
            }
            return;
        }
        boolean matches = s.matches("^[0-1]");
        System.out.println("matches = " + matches);
    }

}

// 给我实现一个函数，函数可以判断字符串是否包含大小写的字母
