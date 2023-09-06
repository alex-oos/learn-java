package com.liaoxuefeng.eReflection;

import java.util.Arrays;

/**
 * @author: Alex
 * @since: 2020/6/5 18:11
 * @Descprition: Class类提供以下几种方法获取Method:
 * 1、Menthod  getMenthod(name,Class ，，，)： 获取某个public的metho（包括父类）
 * 2、Menthod getDeclaredMethod(name.Class ...):获取当前类的某个method（不包括父类）
 * 3、Menthod  getMethods() : 获取所有public 的Menthod（包括父类）
 * 4、Menthod getDeclareMenthods() : 获取当前类的所有Menthod（不包括父类）
 */
public class TestMethod {

    public static void main(String[] args) throws NoSuchMethodException {

        Class stdClass = Student4.class;
        // 获取private方法getScore，参数为String
        System.out.println("stdClass.getMethod(\"getScore\", String.class) = " + stdClass.getMethod("getScore", String.class));
        // 获取继承的public getName 方法，无参数
        System.out.println("stdClass.getMethod(\"getName\") = " + stdClass.getMethod("getName"));
        // 获取private方法getGrade，参数为int:
        System.out.println("stdClass.getDeclaredMethod(\"getGrade\", int.class) = " + stdClass.getDeclaredMethod("getGrade", int.class));
        // 获取所有public 的Menthod（包括父类）
        System.out.println("stdClass = " + Arrays.toString(stdClass.getMethods()));
        // 获取当前类中所有方法，包括private方法
        System.out.println("stdClass.getDeclaredMethods() = " + Arrays.toString(stdClass.getDeclaredMethods()));
    }

}

class Student4 extends Person4 {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}

class Person4 {
    public String getName() {
        return "Person4";
    }
}
