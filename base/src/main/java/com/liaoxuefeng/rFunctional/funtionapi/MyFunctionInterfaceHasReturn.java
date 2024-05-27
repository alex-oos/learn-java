package com.liaoxuefeng.rFunctional.funtionapi;

//定义一个函数式接口，有参有返回值的
@FunctionalInterface
public interface MyFunctionInterfaceHasReturn<T, R> {

    R run(T t);

}
