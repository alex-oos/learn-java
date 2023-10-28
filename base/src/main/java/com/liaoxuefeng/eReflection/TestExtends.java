package com.liaoxuefeng.eReflection;

/**
 * @author Alex
 * @since 2020/6/7 下午 6:05
 * @Descprition: 反射获取继承关系
 */
public class TestExtends {

    /**
     * 使用反射获取实class的三种方式
     */
    public static void f1() throws ClassNotFoundException {
        // 方式一： 使用.class
        Class<String> stringClass = String.class;

        // 方式二： 使用getCLass()
        String s = "Hello";
        Class cls = s.getClass();

        // 方式三：class.forName(""),传入完整的Class 类名
        Class<?> aClass = Class.forName("java.lang.String");

    }

    /**
     * 获取父类类型
     * 1、使用getSuperclass()方法
     * 2、getInterfaces()只返回当前类直接实现的接口类型，并不包括其父类实现的接口类型
     * 过Class对象可以获取继承关系：
     * <p>
     * Class getSuperclass()：获取父类类型；
     * Class[] getInterfaces()：获取当前类实现的所有接口。
     * 通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现。
     */
    // 获取父类
    public static void f2() {

        Class<Integer> i = Integer.class;
        Class<? super Integer> s = i.getSuperclass();
        System.out.println("s = " + s);
        Class<? super Integer> s1 = s.getSuperclass();
        System.out.println("s1 = " + s1);
        System.out.println("s1.getSuperclass() = " + s1.getSuperclass());

    }

    // 获取Interface
    // getInterfaces()只返回当前类直接实现的接口类型，并不包括其父类实现的接口类型：
    // Class[] getInterfaces()：获取当前类实现的所有接口。
    public static void f3() {
        Class<Integer> s = Integer.class;
        Class<?>[] interfaces = s.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface);
        }
        System.out.println(java.io.DataInputStream.class.getSuperclass());// java.io.FilterInputStream，因为DataInputStream继承自FilterInputStream
        System.out.println(java.io.Closeable.class.getSuperclass());  // null，对接口调用getSuperclass()总是返回null，获取接口的父接口要用getInterfaces()
        System.out.println(java.io.Closeable.class.getInterfaces()); // 返回继承的接口

    }

    // 继承关系
    // 通过Class对象的isAssignableFrom()方法可以判断一个向上转型是否可以实现。
    public static void f4() {
        Class n = Integer.class;
/*      boolean isDouble = n instanceof Double; // false
        boolean isInteger = n instanceof Integer; // true
        boolean isNumber = n instanceof Number; // true
        boolean isSerializable = n instanceof java.io.Serializable; // true*/

        // 如果是两个Class实例，要判断一个向上转型是否成立，可以调用isAssignableFrom()：
        // Integer i = ?
        Integer.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Integer
// Number n = ?
        Number.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Number
// Object o = ?
        Object.class.isAssignableFrom(Integer.class); // true，因为Integer可以赋值给Object
// Integer i = ?
        Integer.class.isAssignableFrom(Number.class); // false，因为Number不能赋值给Integer
    }

    public static void main(String[] args) throws ClassNotFoundException {
        f1();
        f2();
        f3();
        f4();


    }

}
