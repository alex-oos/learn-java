package com.liaoxuefeng.bObject.bCoreClass.bJavaBean;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @author Alex
 * @since 2020/5/29 17:30
 * @Descprition:
 */
public class Person {

    private String name;
    private int age;

    public static void main(String[] args) {
        try {
            BeanInfo info = Introspector.getBeanInfo(Person.class);
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                System.out.println("pd.getName() = " + pd.getName());
                System.out.println("pd.getReadMethod() = " + pd.getReadMethod());
                System.out.println("pd.getWriteMethod() = " + pd.getWriteMethod());

            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

  /*  如果读写方法符合以下这种命名规范：
    // 读方法:
    public Type getXyz()
    // 写方法:
    public void setXyz(Type value) 叫做javaBean
    JavaBean的作用
    JavaBean主要用来传递数据，即把一组数据组合成一个JavaBean便于传输。此外，JavaBean可以方便地被IDE工具分析，生成读写属性的代码，主要用在图形界面的可视化设计中。

JavaBean是一种符合命名规范的class，它通过getter和setter来定义属性；

属性是一种通用的叫法，并非Java语法规定；

可以利用IDE快速生成getter和setter；

使用Introspector.getBeanInfo()可以获取属性列表。


    */

    public void setAge(int age) {
        this.age = age;
    }
}
