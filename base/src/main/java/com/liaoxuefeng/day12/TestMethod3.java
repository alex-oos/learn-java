package com.liaoxuefeng.day12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: 李将
 * @Date: 2020/6/6 上午 12:15
 * @Descprition: 一个Menthod 对象可以包含一个方法的所有信息：
 * 1、getName() 返回方法，例如："getScore"
 * 2、getReturnType(): 返回方法返回值类型，也是一个Class类型，例如：String.class
 * 3、getParameterType():返回方法的参数类型，是一个Class数据，例如：{String.class,int,class}
 * 4、getModifiers():返回方法的修饰符，它是一个int,不同的bit有不同的含义
 */
public class TestMethod3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // String对象:
        String s = "hello";
        // 获取String substring(int)方法，参数为int:

        Method m = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取结果:

        String r = (String) m.invoke(s, 6);

        System.out.println("r = " + r);
    }

}
