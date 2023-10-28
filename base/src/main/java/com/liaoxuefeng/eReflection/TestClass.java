package com.liaoxuefeng.eReflection;

import com.liaoxuefeng.bObject.bCoreClass.bJavaBean.Person;

/**
 * @author Alex
 * @since 2020/6/4 18:05
 * @Descprition: 反射：通过Classs实例获取class信息的方法称为反射
 */
public class TestClass {

    /**
     * 通过反射获取class实例的方法有三种：
     */
    public static void f() {

        // 方法一：直接通过一个class的静态变量class获取：
        Class cls = String.class;

        // 方法二：如果我们有一个实例变量，可以通过该实例变量提供getClass（）方法获取：
        String s = "hello";
        Class clss = s.getClass();

        // 方法三： 如果知道一个class 的完整类型，可以通过静态方法class.forName（）获取
        try {
            Class cls1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void f1() {

        // 因为Class实例在JVM中是唯一的，所以，上述方法获取的Class实例是同一个实例。可以用==比较两个Class实例：
        Class cls1 = String.class;

        String s = "hello";
        Class cls2 = s.getClass();

        boolean sameClass = cls1 == cls2;
        System.out.println("sameClass = " + sameClass);

        // 注意一下Class实例比较和instanceof的差别：
        Integer n = Integer.valueOf(123);

        boolean b1 = n instanceof Integer;   // true，因为n是Integer类型
        boolean b2 = n instanceof Number;  // true，因为n是Number类型的子类

        boolean b3 = n.getClass() == Integer.class;  // true，因为n.getClass()返回Integer.class

        // boolean b4 = n.getClass() == Number.class;  // false，因为Integer.class!=Number.class
        // 用instanceof不但匹配指定类型，还匹配指定类型的子类。而用==判断class实例可以精确地判断数据类型，但不能作子类型比较。
        System.out.println("b3 = " + b3);


        // 取到了一个Class实例，我们就可以通过该Class实例来创建对应类型的实例
        Class cls = String.class;
        try {
            String s1 = (String) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


    /**
     * class 中常用的方法有：
     *
     * @param cls
     */
    public static void printClassInfo(Class cls) {
        System.out.println("cls.getName() = " + cls.getName());
        System.out.println("cls.getSimpleName() = " + cls.getSimpleName());

        if (cls.getPackage() != null) {
            System.out.println("cls.getPackage().getName() = " + cls.getPackage().getName());
        }

        System.out.println("cls.isInterface() = " + cls.isInterface());
        System.out.println("cls.isEnum() = " + cls.isEnum());
        System.out.println("cls.isArray() = " + cls.isArray());
        System.out.println("cls.isPrimitive() = " + cls.isPrimitive());

    }

    /**
     * 动态加载：
     *     JVM在执行Java程序的时候，并不是一次性把所有用到的class全部加载到内存，而是第一次需要用到class时才加载。例如：
     */
    public static void create(String name) {
        Person person = new Person();
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {

        f1();

        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);

        // 动态加载：
        if (args.length > 0) {
            create(args[0]);
        }



    }


}
