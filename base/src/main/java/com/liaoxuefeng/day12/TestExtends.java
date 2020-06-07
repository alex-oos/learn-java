package com.liaoxuefeng.day12;

/**
 * @Auther: 李将
 * @Date: 2020/6/7 下午 6:05
 * @Descprition: 反射获取继承关系
 * 1、使用getSuperclass()方法
 * 2、getInterfaces()只返回当前类直接实现的接口类型，并不包括其父类实现的接口类型
 * 过Class对象可以获取继承关系：
 * <p>
 * Class getSuperclass()：获取父类类型；
 * Class[] getInterfaces()：获取当前类实现的所有接口。
 * 通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现。
 */
public class TestExtends {
    public static void main(String[] args) {
        Class cls = Integer.class;
        Class cls1 = cls.getSuperclass();
        System.out.println("cls.getSuperclass() = " + cls.getSuperclass()); //Integer的父类是Number
        Class cls2 = cls1.getSuperclass();
        System.out.println("cls2 = " + cls2); // Number 的父类是Object


        // 2、获取到interface类
        Class c = Integer.class;
        Class[] is = c.getInterfaces();
        for (Class i : is) {
            System.out.println("i = " + i);
        }

        System.out.println(java.io.DataInputStream.class.getSuperclass());// java.io.FilterInputStream，因为DataInputStream继承自FilterInputStream
        System.out.println(java.io.Closeable.class.getSuperclass());  // null，对接口调用getSuperclass()总是返回null，获取接口的父接口要用getInterfaces()
        System.out.println(java.io.Closeable.class.getInterfaces()); // 返回继承的接口

        //继承关系
        Class n = Integer.class;
/*      boolean isDouble = n instanceof Double; // false
        boolean isInteger = n instanceof Integer; // true
        boolean isNumber = n instanceof Number; // true
        boolean isSerializable = n instanceof java.io.Serializable; // true*/

        //如果是两个Class实例，要判断一个向上转型是否成立，可以调用isAssignableFrom()：
        // Integer i = ?
        Integer.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Integer
// Number n = ?
        Number.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Number
// Object o = ?
        Object.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Object
// Integer i = ?
        Integer.class.isAssignableFrom(Number.class); // false，因为Number不能赋值给Integer

    }

}
