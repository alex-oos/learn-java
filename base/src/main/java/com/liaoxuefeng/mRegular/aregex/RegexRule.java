package com.liaoxuefeng.mRegular.aregex;

/**
 * @autoer Alex
 * @since: 2023/9/8 上午11:27
 * @Descprition: 正则表达式匹配规则: <br>
 * 从左到右按规则进行匹配
 * 一、精准匹配：
 */
public class RegexRule {

    /**
     * 精准匹配字符串：adc
     */
    public static void f1() {

        String regex = "adc";
        System.out.println("abc".matches(regex));
        System.out.println("acd".matches(regex));

        String re2 = "a\\&c"; // 对应的正则是 a\&c
        System.out.println("a&c".matches(re2));
        System.out.println("a-c".matches(re2));
        System.out.println("a&&c".matches(re2));

    }

    /**
     * 精准匹配：匹配单个字符
     * 匹配任意字符: 用.
     * 匹配数字： 用\d 来匹配,在java使用的过程中需要转义
     * 匹配常用字符： 用\w可以匹配一个字母、数字或下划线
     * 匹配空格字符： 用\s可以匹配一个空格字符，注意空格字符不但包括空格，还包括tab字符（在Java中用\t表示）
     * 匹配非数字：用\d可以匹配一个数字，而\D则匹配一个非数字
     */
    public static void f2() {
        // 匹配数字:\d
        boolean matches = "007".matches("00\\d");
        System.out.println("匹配007结果：" + matches);

        // 匹配常用字符：\w 可以匹配到 字母 数字 _ 但是不能匹配到#空格等字符
        boolean matches1 = "javac".matches("java\\w");
        System.out.println("匹配javac结果为：" + matches1);
        boolean matches2 = "java9".matches("java\\w");
        System.out.println("java9的匹配结果为： " + matches2);
        boolean matches3 = "java_".matches("java_\\w");
        System.out.println("java_的匹配结果为： " + matches3);

        // 匹配空格字符串：\s ,注意空格字符不但包括空格，还包括tab字符（在Java中用\t表示
        boolean matches4 = "a c".matches("a\\sc");
        System.out.println("a c 的匹配结果为： " + matches4);

        // 匹配非数字： \D
        boolean matches5 = "00A".matches("00\\D");
        System.out.println("00A的匹配结果为： " + matches5);

    }

    /**
     * 重复匹配 <br>
     * 1. 修饰符*可以匹配任意个字符   <br>
     * 2. 修饰符+可以匹配至少一个字符 <br>
     * 3. 修饰符?可以匹配0个或一个字符 <br>
     * 4. 精确指定n个字符 ,{n} <br>
     * 5. 精确匹配n~m个字符 ，修饰 符 {n,m} <br>
     */
    public static void f3() {
        // 匹配任意字符：*
        boolean matches = "A".matches("A*");
        System.out.println("A的匹配结果为： = " + matches);
        boolean matches1 = "A0".matches("A\\d*");
        System.out.println("matches1 = " + matches1);
        boolean matches2 = "A00".matches("A\\d*");
        System.out.println("matches2 = " + matches2);
        boolean matches3 = "A380".matches("A\\d*");
        System.out.println("matches3 = " + matches3);

        // 匹配至少一个字符 +
        boolean matches4 = "A0".matches("A\\d+");
        System.out.println("matches4 = " + matches4);
        boolean matches5 = "A380".matches("A\\d+");
        System.out.println("matches5 = " + matches5);

        // 修饰符？ 匹配0或一个字符
        String re1 = "A\\d?";
        boolean matches6 = "A".matches(re1);
        System.out.println("A的匹配结果为： " + matches6);
        boolean matches7 = "A0".matches(re1);
        System.out.println("matches7 = " + matches7);
        boolean matches8 = "A01".matches(re1);
        System.out.println("matches8 = " + matches8);

        // 匹配n个字符
        String re2 = "A\\d{2}";
        boolean matches9 = "A000".matches(re2);
        System.out.println("matches9 = " + matches9);

        // 匹配n到m个字符
        String re3 = "A\\d{1,2}";
        boolean matches10 = "A00000".matches(re3);
        System.out.println("matches10 = " + matches10);
        boolean matches11 = "A00".matches(re3);
        System.out.println("matches11 = " + matches11);

    }

    /**
     * 复杂的匹配规则：
     * 1.匹配开头和结尾
     * ^表示开头，$表示结尾
     * eg:^A\d{3}$，可以匹配"A001"、"A380"
     * 2. 匹配指定范围: 写一个【】 可以写指定数字
     * 0 - 9 :字符0到9
     * a-f:字符a到f
     * A-f:字符A到F
     */
    public static void f4() {

        // 匹配开头和结尾
        String regex = "^A\\d{3}$";
        boolean matches = "A001".matches(regex);
        System.out.println("A001的匹配结果为： " + matches);
        boolean matches1 = "A380".matches(regex);
        System.out.println("A380的匹配结果为：" + matches1);

        // 匹配指定范围
        boolean matches2 = "123".matches("[0-9]");
        System.out.println("匹配指定范围： " + matches2);

        // 排除指定范围 假设我们要匹配任意字符，但不包括数字，可以写[^1-9]{3}
        String re1 = "[^1-9]{3}";
        boolean matches3 = "1234".matches(re1);
        System.out.println("matches3 = " + matches3);
        boolean matches4 = "asd".matches(re1);
        System.out.println("matches4 = " + matches4);

        // 规则匹配 用|连接的两个正则规则是或规则，例如，AB|CD表示可以匹配AB或CD
        String re2 = "java|python";
        System.out.println("java".matches(re2));
        System.out.println("python".matches(re2));
        System.out.println("go".matches(re2));

    }

    public static void function() {

    }

    public static void main(String[] args) {

        f1();
        f2();
        f3();
        f4();
    }

}
