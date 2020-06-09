package com.liaoxuefeng.eReflection;

/**
 * @Auther: 李将
 * @Date: 2020/6/5 18:11
 * @Descprition: Class类提供以下几种方法获取Method:
 * 1、Menthod  getMenthod(name,Class ，，，)： 获取某个public的metho（包括父类）
 * 2、Menthod getDeclaredMethod(name.Class ...):获取当前类的某个method（不包括父类）
 * 3、Menthod  getMethods() : 获取所有public 的Menthod（包括父类）
 * 4、Menthod getDeclareMenthods() : 获取当前类的所有Menthod（不包括父类）
 */
public class TestMethod {

    public static void main(String[] args) throws NoSuchMethodException {
        Class stdClass = Student4.class;
        // 获取public方法getScore，参数为String
        System.out.println("stdClass.getMethod(\"getScore\", String.class) = " + stdClass.getMethod("getName"));
        //获取继承的public方法

        System.out.println("stdClass.getDeclaredMethod(\"getGrade\", int.class) = " + stdClass.getDeclaredMethod("getGrade", int.class));

        System.out.println("stdClass = " + stdClass.getMethods());

        System.out.println("stdClass.getDeclaredMethods() = " + stdClass.getDeclaredMethods());
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
