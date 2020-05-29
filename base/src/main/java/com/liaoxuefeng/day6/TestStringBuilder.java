package com.liaoxuefeng.day6;

/**
 * @Auther: 李将
 * @Date: 2020/5/29 11:02
 * @Descprition:
 */
public class TestStringBuilder {
    public static void f1() {
        // 字符串拼接，
        //1、每次循环都会创建新的字符串对象，然后扔掉旧的字符串，这样，绝大部分字符串都是临时对象，不仅浪费内存，还影响gc效率
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s = s + "," + i;
        }

        //2、StringBuilder 新增字符串时，不会创建新的对象
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(",");
            sb.append(i);

        }
        String sss = sb.toString();


    }

    // StringBuilder可以进行链式操作
    public static void f2() {
        var sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
    }

    public static void f3() {
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name,position,salary) VALUES(?,?,?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");

    }

    static String buildInsertSql(String table, String[] fields) {
        // TODO:

        var sb1 = new StringBuilder();
        sb1.append("INSERT INTO ")
                .append(table)
                .append(" (");

        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                sb1.append(",");
            }
            sb1.append(fields[i]);
        }
        sb1.append(") VALUES(?,?,?)");
        return sb1.toString();
    }

    public static void main(String[] args) {
        f3();
    }
}
