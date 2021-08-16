package com.liaoxuefeng.rFunctional.aLambda;


import java.util.function.Function;

/**
 * @author Alex
 * @date 2021/8/16 5:43 下午
 * <P>
 *     Lambda 方式学习
 *     </p>
 */
public class LambdaLearn {

    public static void main(String[] args) {
        
        LambdaLearn lambdaLearn = new LambdaLearn();
        /*类型声明*/
        MathOperation addition = (int a,int b) -> a + b;
         /*不用类型声明*/
        MathOperation subtraction = (a, b)->a - b;

        /*大括号中的返回语句*/
        MathOperation multiplication = (int a, int b)->{
            return a * b;
        };
        /*没有大括号和返回值*/
        MathOperation division = (int a, int b)->a / b;

        System.out.println("lambdaLearn.operate(10,5,addition) = " + lambdaLearn.operate(10, 5, addition));

        System.out.println("lambdaLearn = " + lambdaLearn.operate(10, 5, subtraction));
        System.out.println("lambdaLearn = " + lambdaLearn.operate(10, 5, subtraction));

        System.out.println("lambdaLearn = " + lambdaLearn.operate(10, 5, multiplication));

        System.out.println("lambdaLearn = " + lambdaLearn.operate(10, 5,division ));

         /*不用括号*/
        GreetingService greetingService1 = message->System.out.println("hello " + message);

        /*使用括号*/
        GreetingService greetingService2 = (message)->System.out.println("hello " + message);

        greetingService1.sayMessage("Runoob");
        greetingService2.sayMessage("Google");

    }

    interface  MathOperation{
        int operation(int a, int b);
    }

    interface  GreetingService{

        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
