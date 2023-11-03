package com.liaoxuefeng.bObject.bCoreClass.aString;

/**
 * @author Alex
 * @Descprition: Java核心库提供的包装类型可以把基本类型包装为class；
 * <p>
 * 自动装箱和自动拆箱都是在编译期完成的（JDK>=1.5）；
 * <p>
 * 装箱和拆箱会影响执行效率，且拆箱时可能发生NullPointerException；
 * <p>
 * 包装类型的比较必须使用equals()；
 * <p>
 * 整数和浮点数的包装类型都继承自Number；
 * <p>
 * 包装类型提供了大量实用方法。
 * @since 2020/5/29 12:14
 */

public class TypePackaging {

    public static void f1() {

        String s = null;

    }

    public static void main(String[] args) {

        f1();
    }

}
