package com.liaoxuefeng.rFunctional;


import com.liaoxuefeng.rFunctional.aLambda.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @autoer Alex
 * @since: 2023/9/26 下午3:57
 * @Descprition: java 8 特性，方法引用.方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
 * 方法引用使用一对冒号 :: 。
 */
public class MethodReferences {

    /**
     *
     */
    public static void function() {
        // 1.构造器引用
        // 语法：ClassName::new，或者更一般的：Class<T>::new 实例如下：
        Car car = Car.create(Car::new);
        List<Car> cars = Collections.singletonList(car);

        // 2.静态方法引用
        // 语法是：class::static_method，实例如下
        cars.forEach(Car::collide);

        // 3. 特定类的任意对象的方法引用，语法格式是Class::method 实例如下：
        cars.forEach(Car::repair);

        // 4. 特定对象的引用：语法格式是:instance::method 实例如下：
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);


    }

    public static void function1() {

        List<String> names = new ArrayList<>();
        names.add("peter");
        names.add("anna");
        names.add("mike");
        names.add("xenia");
        names.add("alex");

        names.forEach(System.out::println);
    }

    public static void function2() {

        String[] array = new String[]{"Apple", "Orange", "Banana", "Lemon"};
        Arrays.sort(array, String::compareTo);
        System.out.println(String.join(", ", array));

    }

    public static void main(String[] args) {

        function();
        function1();
        function2();
    }

}
