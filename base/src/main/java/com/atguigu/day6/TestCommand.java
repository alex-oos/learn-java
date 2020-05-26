package com.atguigu.day6;

/**
 * @Auther: 李将
 * @Date: 2020/5/26 19:02
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
