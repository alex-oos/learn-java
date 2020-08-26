package com.atguigu.day6;

/**
 * @author: 李将
 * @since: 2020/5/26 19:02
 * @Descprition:
 */
public class TestCommand {
    public static void main(String[] args) {
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
