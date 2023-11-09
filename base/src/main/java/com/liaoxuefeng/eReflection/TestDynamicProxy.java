package com.liaoxuefeng.eReflection;


import com.liaoxuefeng.eReflection.entity.Hello;
import com.liaoxuefeng.eReflection.entity.HelloWorld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author ALex
 * @since 2020/6/7 下午 6:47
 *  动态代理（Dynamic Proxy）:
 * 1、
 * 2、
 * 在运行期动态创建一个interface实例的方法如下：
 * <p>
 * 1、定义一个InvocationHandler实例，它负责实现接口的方法调用；
 * 2、 通过Proxy.newProxyInstance()创建interface实例，它需要3个参数：
 * 3、使用的ClassLoader，通常就是接口类的ClassLoader；
 * 4、需要实现的接口数组，至少需要传入一个接口进去；
 * 5、用来处理接口方法调用的InvocationHandler实例。
 * 6、将返回的Object强制转型为接口。
 * Java标准库提供了动态代理功能，允许在运行期动态创建一个接口的实例；
 * <p>
 * 动态代理是通过Proxy创建代理对象，然后将接口方法“代理”给InvocationHandler完成的。
 */
public class TestDynamicProxy {

    /**
     * 所有interface类型的变量总是通过某个实例向上转型并赋值给接口类型变量的：
     */
    public static void f1() {
        // 创建实例，转型为借口并调用
        Hello hello = new HelloWorld();
        hello.morning("Bob");

    }

    /**
     * 使用动态代理来实现：
     * 先定义了接口Hello，但是我们并不去编写实现类，而是直接通过JDK提供的一个Proxy.newProxyInstance()创建了一个Hello接口对象。这种没有实现类但是在运行期动态创建了一个接口对象的方式，我们称为动态代码。JDK提供的动态创建接口对象的方式，就叫动态代理
     * 在运行期动态创建一个interface实例的方法如下：
     * 定义一个InvocationHandler实例，它负责实现接口的方法调用；
     * 通过Proxy.newProxyInstance()创建interface实例，它需要3个参数：
     * 使用的ClassLoader，通常就是接口类的ClassLoader；
     * 需要实现的接口数组，至少需要传入一个接口进去；
     * 用来处理接口方法调用的InvocationHandler实例。
     * 将返回的Object强制转型为接口。
     * 动态代理实际上是JVM在运行期动态创建class字节码并加载的过程，它并没有什么黑魔法，把上面的动态代理改写为静态实现类大概长这样：
     */
    public static void f2() {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), // 传入ClassLoader
                new Class[]{Hello.class}, // 传入要实现的接口
                handler); // 传入处理调用方法的InvocationHandler
        hello.morning("Bob");
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
