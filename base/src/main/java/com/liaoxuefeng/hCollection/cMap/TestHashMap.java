package com.liaoxuefeng.hCollection.cMap;


import java.util.HashMap;
import java.util.Map;

/**
 * @author: TangKaiZe
 * @since: 2021/7/6 下午 9:21
 * <p>
 * HashMap 的基本用法
 * </p>
 */
public class TestHashMap {

    public static void function() {

        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("username", "lijiang");
        hashMap.put("password", "Wlx123456.");
        for (String s : hashMap.keySet()) {
            System.out.println("key : " + s + " value: " + hashMap.get(s));
        }
    }

    public static void main(String[] args) {

        function();
    }

}
