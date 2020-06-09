package com.liaoxuefeng.bObject.bCoreClass.aString;

/**
 * @Auther: 李将
 * @Date: 2020/5/29 上午 12:14
 * @Descprition:
 */
public class TestStringBuilder {
    public static void main(String[] args) {

        // stringbuilder 拼接对象
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(',');
            stringBuilder.append(i);
        }
        System.out.println("stringBuilder.toString() = " + stringBuilder.toString());

        // string builder 链式操作
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());

    }

}
