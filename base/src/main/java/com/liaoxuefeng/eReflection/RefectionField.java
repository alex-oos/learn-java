package com.liaoxuefeng.eReflection;


import com.liaoxuefeng.eReflection.entity.Person1;
import com.liaoxuefeng.eReflection.entity.Person3;
import com.liaoxuefeng.eReflection.entity.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author Alex
 * @Descprition: 反射中访问字段
 * @since 2020/6/5 15:33
 */
public class RefectionField {

    /**
     * CLass 类提供了以下几种方法来获取字段：
     * 1、Field getField(name)：根据字段名获取某个public的field(包括父类)
     * 2、Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
     * 3、Field getFields(): 获取所有public的field（包括父类）
     * 4、Field[] getDeclaredFields():获取当签类的所有field
     */
    public static void getFields() throws NoSuchFieldException {

        Class stdClass = Student.class;

        // 获取public 字段 "score"
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
    public static void fieldClass() throws NoSuchFieldException {

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

    /**
     * 获取具体值
     * 通过Field对象的get(Object)方法可以获取字段的当前值：
     */
    public static void getFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Person1 p = new Person1("xiaoming");
        Class c = p.getClass();
        Field field = c.getDeclaredField("name");
        System.out.println("field = " + field);
        field.setAccessible(true); // Field.setAccessible(true)的意思是，别管这个字段是不是public，一律允许访问。

        Object value = field.get(p); // 根据实例获取字段值
        System.out.println("value = " + value);
    }

    /**
     * 设置字段值 <br/>
     * 通过Field实例既然可以获取到指定实例的字段值，自然也可以设置字段的值。<br/>
     * 设置字段值是通过Field.set(Object, Object)实现的，其中第一个Object参数是指定的实例，第二个Object参数是待修改的值。示例代码如下
     *
     * @param args
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void setFieldValue() throws NoSuchFieldException, IllegalAccessException {

        Person3 person3 = new Person3("xiao ming");
        System.out.println("person3.getName() = " + person3.getName());
        Class c = person3.getClass();
        Field field = c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person3, "xiao  bai");
        System.out.println("Person3 = " + person3.getName());


    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        getFields();
        fieldClass();
        getFieldValue();
        setFieldValue();
    }

}
