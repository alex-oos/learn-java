package com.liaoxuefeng.rFunctional.funtionapi;

//定义一个函数式接口，有参的
@FunctionalInterface
public interface MyFunctionalHasParameter<T> {
    void  run(T val);
}
