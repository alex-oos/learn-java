package com.liaoxuefeng.rFunctional.funtionapi;

/**
 * @author Alex
 * @since 2024/5/27 上午10:29
 * <p></p>
 */
//自定义一个函数接口，并且自己去调用
public class CustomerFunctionDemo {

    public static void function(MyFunctionInterface functional) {

        beforeFunction();
        functional.run();
        afterFunction();
    }


    public static void function1(MyFunctionalHasParameter<Integer> functional, Integer i) {

        beforeFunction();
        functional.run(i);
        afterFunction();
    }

    public static void function2(MyFunctionInterfaceHasReturn<Integer, Integer> functional, Integer i) {

        beforeFunction();
        Integer run = functional.run(i);
        System.out.println("我搬砖的分数是：" + run);
        afterFunction();
    }


    public static void beforeFunction() {

        System.out.println("我要开始干活了");
        System.out.println("我搬了一块砖");
        System.out.println("接下来是老板安排的任务");
    }

    public static void afterFunction() {

        System.out.println("活干完了");


    }

    public static void main(String[] args) {

        function(() -> {
            System.out.println("老板让我写报告");
            System.out.println("写报告中");
        });
        function1((i) -> {
            System.out.println("老板安排的认为编号为：" + i);
        }, 1);
        function2((i) -> {
            System.out.println("老板让我搬砖");
            return i * 10;
        }, 1);
    }

}
