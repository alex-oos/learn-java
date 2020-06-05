package com.liaoxuefeng.day12;

/**
 * @Auther: 李将
 * @Date: 2020/6/5 11:40
 * @Descprition:
 */
public class Main {

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


    public static void main(String[] args) {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }

}
