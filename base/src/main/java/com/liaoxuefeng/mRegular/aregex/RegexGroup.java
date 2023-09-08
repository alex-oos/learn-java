package com.liaoxuefeng.mRegular.aregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: 李将
 * @since: 2020/7/13 11:48
 * @Descprition: 正则表达式：分组匹配
 */
public class RegexGroup {

    /*
     * 使用regex进行正则匹配：
     * 用Pattern对象匹配，匹配后获得一个Matcher对象，如果匹配成功，就可以直接从Matcher.group(index)返回子串：
     * */
    public static void function() {

        Pattern pattern = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher matcher = pattern.matcher("010-12345678");
        if (matcher.matches()) {
            String g1 = matcher.group(1);
            String g2 = matcher.group(2);
            System.out.println(g1);
            System.out.println(g2);
        } else {
            System.out.println("匹配失败!");
        }
    }

    /**
     * 使用Matcher时，必须首先调用matches()判断是否匹配成功，匹配成功后，才能调用group()提取子串。
     * 利用提取子串的功能，我们轻松获得了区号和号码两部分。
     */

    public static void function1() {

        Pattern pattern = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        pattern.matcher("010-12345678").matches();
        pattern.matcher("021-123456").matches();
        pattern.matcher("0123-12345").matches();

        Matcher matcher = pattern.matcher("010-1230456");
        if (matcher.matches()) {
            String whole = matcher.group(0);
            String area = matcher.group(1);
            String tel = matcher.group(2);
            System.out.println(area);
            System.out.println(tel);

        }


    }

    public static void function2() {

        Pattern pattern = Pattern.compile("(\\d+?)(0*)");
        Matcher matcher = pattern.matcher("1234560000");
        if (matcher.matches()) {
            System.out.println("matcher.group(1) = " + matcher.group(1));
            System.out.println("matcher.group(2) = " + matcher.group(2));

        }

    }

    /**
     * 正则表达式分割字符串可以实现更加灵活的功能。String.split()方法传入的正是正则表达式。
     * 分割字符串：String.split()
     * 搜索子串：Matcher.find()
     * 替换字符串：String.replaceAll()
     */

    public static void function3() {

        String s = "the quick brown fox jumps over the lazy dog";

        Pattern pattern = Pattern.compile("\\wo\\w");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String sub = s.substring(matcher.start(), matcher.end());
            System.out.println(sub);
        }

        String r = s.replaceAll("\\s+", " ");
        System.out.println(r); // "The quick brown fox jumps over the lazy dog."


    }

    public static void main(String[] args) {

        function1();
        function2();
        function3();


    }

}
