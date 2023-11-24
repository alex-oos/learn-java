package com.liaoxuefeng.eReflection;

import com.liaoxuefeng.eReflection.entity.Student4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Alex
 * @since 2020/6/6 上午 12:15
 */
public class ReflectionMethods {

    /**
     * 获取Method的几种方法：
     * Class类提供以下几种方法获取Method:
     * 1、Method  getMethod(name,Class ，，，)： 获取某个public的method（包括父类）
     * 2、Method  getMethods() : 获取所有public 的Menthod（包括父类）
     * 2、Method getDeclareMethods() : 获取当前类的所有Menthod，包含括private方法 （不包括父类）
     * 3、Method getDeclaredMethod(name.Class ...):获取当前类的某个method，包含括private方法（不包括父类）
     **/
    public static void getMethodWays() throws NoSuchMethodException {

        Class stdClass = Student4.class;
        // 获取private方法getScore，参数为String
        System.out.println("stdClass.getMethod(\"getScore\", String.class) = " + stdClass.getMethod("getScore", String.class));
        // 获取继承的public getName 方法，无参数
        System.out.println("stdClass.getMethod(\"getName\") = " + stdClass.getMethod("getName"));
        // 获取private方法getGrade，参数为int:
        System.out.println("stdClass.getDeclaredMethod(\"getGrade\", int.class) = " + stdClass.getDeclaredMethod("getGrade", int.class));
        // 获取所有public 的Menthod（包括父类）
        System.out.println("stdClass.getMethods() = " + Arrays.toString(stdClass.getMethods()));
        // 获取当前类中所有方法，包括private方法
        System.out.println("stdClass.getDeclaredMethods() = " + Arrays.toString(stdClass.getDeclaredMethods()));
    }

    /**
     * 反射 Methond 里面常用的一些方法
     * * 一个Menthod 对象可以包含一个方法的所有信息：
     * * 1、getName() 返回方法，例如："getScore"
     * * 2、getReturnType(): 返回方法返回值类型，也是一个Class类型，例如：String.class
     * * 3、getParameterType():返回方法的参数类型，是一个Class数据，例如：{String.class,int,class}
     * * 4、getModifiers():返回方法的修饰符，它是一个int,不同的bit有不同的含义
     *
     * @throws NoSuchMethodException
     */
    public static void methodClass() throws NoSuchMethodException {
        // String对象:
        String s = "Hello world";
        // 获取String substring(int)方法，参数为int:
        Method m = String.class.getMethod("substring", int.class);

        System.out.println("m.getName() = " + m.getName());
        System.out.println("m.getReturnType() = " + m.getReturnType());
        System.out.println("m.getParameterTypes() = " + Arrays.toString(m.getParameterTypes()));
        System.out.println("m.getModifiers() = " + m.getModifiers());
    }

    /**
     * 使用反射调用方法的实际应用
     * 核心就是invoke() 方法调用
     * invoke 需要传入一个实例对象，对Method实例调用invoke就相当于调用该方法，invoke的第一个参数是对象实例，即在哪个实例上调用该方法，后面的可变参数要与方法参数一致，否则将报错。
     */
    public static void methodsScenarios() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        // 原来实现逻辑
        String s = "Hello world";
        String r = s.substring(6); // "world"
        System.out.println("r = " + r);

        // 使用反射实现逻辑 
        //  方法一：反射传一个参数
        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取结果:
        // invoke 需要传入一个实例对象
        // 对Method实例调用invoke就相当于调用该方法，invoke的第一个参数是对象实例，即在哪个实例上调用该方法，后面的可变参数要与方法参数一致，否则将报错。
        String r1 = (String) m.invoke(s, 6);
        System.out.println("反射调用一个参数：" + r1);

        // 方法二：反射传多个参数
        // 获取String substring(int,int)方法，参数为int,int:
        Object o1 = String.class.getMethod("substring", int.class, int.class).invoke(s, 0, 6);
        System.out.println("反射调用多个参数：" + o1);

        // 调用public方法
        // 如果获取的方法是静态方法，则invoke方法传入的第一个参数是null，后面的可变参数要与方法参数一致
        Method method = Integer.class.getMethod("parseInt", String.class);
        Object o = method.invoke(null, "123");
        System.out.println("o = " + o);

        // 调用非public方法
        // 先使用 Class.getDeclaredMethod()获取该方法实例，然后，用Method.setAccessible(true)允许其调用
        Student4 s4 = new Student4();
        Method m1 = s4.getClass().getDeclaredMethod("getGrade", int.class);
        m1.setAccessible(true);
        m1.invoke(s4, 1);
    }


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        getMethodWays();
        methodClass();
        methodsScenarios();


    }

}
