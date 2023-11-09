package com.liaoxuefeng.eReflection;

import com.liaoxuefeng.eReflection.entity.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Alex
 * @since 2020/6/7 下午 5:48
 *  反射调用构造方法
 */
public class TestConstructionMethod {

    public static void f1() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        // 正常创建实例
        Person p = new Person();

        // 反射创建实例
        Person person = Person.class.newInstance();

    }

    /**
     * 使用Constuctor对象，调用，返回实例
     * <p>
     * 通过Class实例获取Constructor的方法如下：
     * 1、getConstructor(Class...)：获取某个public的Constructor；
     * 2、getDeclaredConstructor(Class...)：获取某个Constructor；
     * 3、getConstructors()：获取所有public的Constructor；
     * 4、getDeclaredConstructors()：获取所有Constructor。
     * 注意Constructor总是当前类定义的构造方法，和父类无关，因此不存在多态的问题。
     * <p>
     * <p>
     * Constructor对象封装了构造方法的所有信息；
     * <p>
     * 通过Class实例的方法可以获取Constructor实例：getConstructor()，getConstructors()，getDeclaredConstructor()，getDeclaredConstructors()；
     * <p>
     * 通过Constructor实例可以创建一个实例对象：newInstance(Object... parameters)； 通过设置setAccessible(true)来访问非public构造方法。
     * <p>
     * 调用非public的Constructor时，必须首先通过setAccessible(true)设置允许访问。setAccessible(true)可能会失败
     */
    public static void f2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取构造方法 Interger(int)
        Constructor<Integer> constructor = Integer.class.getConstructor(int.class);
        // 调用构造方法
        Integer i = constructor.newInstance(123);

        System.out.println("i = " + i);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        f1();
        f2();


    }

}
