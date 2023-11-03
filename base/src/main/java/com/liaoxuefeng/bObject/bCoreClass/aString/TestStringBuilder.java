package com.liaoxuefeng.bObject.bCoreClass.aString;

/**
 * @author Alex
 * @since 2020/5/29 上午 12:14
 * @Descprition:
 */
public class TestStringBuilder {

    public static void function() {
        // stringbuilder 拼接对象
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(',');
            stringBuilder.append(i);
        }
        System.out.println("stringBuilder.toString() = " + stringBuilder);

        // string builder 链式操作
        StringBuilder sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb);

    }
    // String、StringBuffer、StringBuilder中的一些方法
    public static void function1() {
        StringBuilder stringBuilder = new StringBuilder();

        // 添加元素
        stringBuilder.append("String ");

        System.out.println(stringBuilder);
        //添加元素
        stringBuilder.append(" StringBuilder");

        System.out.println(stringBuilder);

        stringBuilder.append(" StringBuffer");
        System.out.println(stringBuilder);

        // 删除元素，删除索引值 从0到1
        stringBuilder.delete(0, 1);
        System.out.println(stringBuilder);

        // 修改，设置索引值为2的元素为A
        stringBuilder.setCharAt(2, 'A');
        System.out.println(stringBuilder);

        // 修改，替换，索引值0，到1 为”我是replace方法“
        stringBuilder.replace(0, 1, "我是replace方法");
        System.out.println(stringBuilder);

        // 查查询，字符串，第一个元素
        stringBuilder.charAt(0);
        System.out.println(stringBuilder.charAt(0));

        //插入，在索引值为0的地方，插入insert字符串
        stringBuilder.insert(0, "insert ");
        System.out.println(stringBuilder);

    }
    //String
    public static void main(String[] args) {

       function1();

    }

}
