package demo.regex;

import java.util.Scanner;

/**
 * @author: Alex
 * @date: 2023/9/7 下午2:34
 * @Descprition:
 */
public class RegexExp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.nextLine();
        if (str.contains("|")) {
            String[] split = str.split("\\|");
            for (String s : split) {
                System.out.println("matches = " + s.matches("^[0-9]\\d*$"));
            }

        } else {
            System.out.println("matches = " + str.matches("^[0-9]\\d*$"));
        }
    }

}
