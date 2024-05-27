package com.liaoxuefeng.rFunctional.funtionapi;


/**
 *  函数式接口
 *   概念：函数式接口：有且仅有一个抽象方法的接口
 *   函数式接口：即适用于函数式编程场景的接口。而java中的函数编程体现在Lambda表达式中
 */
//自定义了一个函数式接口 ，无参的
@FunctionalInterface
public interface MyFunctionInterface {
    //有且仅有一个抽象方法
    void  run();

}
