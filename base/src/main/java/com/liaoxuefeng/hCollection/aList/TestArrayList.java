package com.liaoxuefeng.hCollection.aList;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author LiJiang
 * @since 2021/6/28 11:47
 */
public class TestArrayList {

    /**
     * Arrays.asList()在平时开发中还是比较常见的，我们可以使用它将一个数组转换为一个List集合。
     */

    public static void function() {
        String[] mArray = {"a", "n", "c"};
        List<String> stringList = Arrays.asList(mArray);
        //
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");
//        list.clear();

        list.forEach(System.out::println);

    }

    public static void main(String[] args) {
        function();
    }
}
