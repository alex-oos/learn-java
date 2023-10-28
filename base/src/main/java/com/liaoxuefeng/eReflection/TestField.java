package com.liaoxuefeng.eReflection;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author Alex
 * @since 2020/6/5 15:33
 * @Descprition: 反射中访问字段
 */
public class TestField {

    /**   CLass 类提供了以下几种方法来获取字段：
     *  1、Field getField(name)：根据字段名获取某个public的field(包括父类)
     *  2、Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
     *  3、Field getFields(): 获取所有public的field（包括父类）
     *  4、Field[] getDeclaredFields():获取当签类的所有field
     */
    public static void f() throws NoSuchFieldException {
        Class stdClass = Student.class;

        //获取public 字段 "score"
        System.out.println("stdClass.getField(\"score\") = " + stdClass.getField("score"));

        // 获取student 中的"grade"
        System.out.println("stdClass.getDeclaredField(\"grade\") = " + stdClass.getDeclaredField("grade")); // class [B 表示byte[]类型

        System.out.println("stdClass.getFields() = " + Arrays.toString(stdClass.getFields()));

        System.out.println("stdClass.getDeclaredFields() = " + Arrays.toString(stdClass.getDeclaredFields()));
    }

    /**
     * 一个Field对象包含一个字段的所有信息：
     * 1、getName（）：返回字段名称，例如，"name"
     * 2、getType():返回字段类型，也是一个Class实例，例如：String.class;
     * 3、getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义
     */
    public static void f1() throws NoSuchFieldException {

        Field field = String.class.getDeclaredField("value");
        System.out.println("field.getName() = " + field.getName());
        System.out.println("field.getType() " + field.getType());

        int m = field.getModifiers();
        System.out.println("m = " + m);
        System.out.println("Modifier.isFinal(m) = " + Modifier.isFinal(m));
        System.out.println("Modifier.isPublic(m) = " + Modifier.isPublic(m));
        System.out.println("Modifier.isProtected(m) = " + Modifier.isProtected(m));
        System.out.println("Modifier.isPrivate(m) = " + Modifier.isPrivate(m));
        System.out.println("Modifier.isStatic(m) = " + Modifier.isStatic(m));
    }

    public static void main(String[] args) throws NoSuchFieldException {
        f1();
    }

}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}
