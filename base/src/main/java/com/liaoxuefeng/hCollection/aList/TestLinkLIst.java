package com.liaoxuefeng.hCollection.aList;


import java.util.LinkedList;
import java.util.List;

/**
 * @author: TangKaiZe
 * @since: 2020/6/11 16:37
 * <p>
 * LinkList
 * </p>
 */
public class TestLinkLIst {

    public static void function() {

        List<String> link = new LinkedList<>();
        link.add("apple");
        link.add("banner");
        link.add("origin");
        link.add(0, "Wiki");
        System.out.println("link = " + link);


    }


    public static void main(String[] args) {
        function();

    }

}
