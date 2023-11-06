package com.liaoxuefeng.bObject.bCoreClass.dUtil;

import com.liaoxuefeng.bObject.bCoreClass.dUtil.entity.Point1;

/**
 * @author Alex
 * @since 2020/6/2 15:19
 * @Descprition:
 */

/*
不变类：
       不变类有以下特点：
       1、定义class时使用final ，无法派生类
       2、每个字段使用final，保证创建失利后无法修改任何字段
       使用record定义的是不变类；
        可以编写Compact Constructor对参数进行验证；
        可以定义静态方法。
*
* */
public class Main {
    public static void main(String[] args) {
        Point1 p = new Point1(123, 456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
    }

}
