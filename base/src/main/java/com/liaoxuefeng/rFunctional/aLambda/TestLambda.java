package com.liaoxuefeng.rFunctional.aLambda;


import java.util.Arrays;
import java.util.List;

/**
 * @author: TangKaiZe
 * @since: 2021/7/13 下午 9:22
 * <p>
 * lambda式的使用方式
 * </p>
 */
public class TestLambda {

    /**
     * 实现类引用
     */
    public static void a() {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        names.sort((a, b)->{
            return b.compareTo(a);
        });

    }

    /**
     * 方法引用
     */
    public static void function() {

        String[] array = new String[]{"Apple", "Orange", "Banana", "Lemon"};
        Arrays.sort(array, String :: compareTo);
        System.out.println(String.join(", ", array));

    }

}
