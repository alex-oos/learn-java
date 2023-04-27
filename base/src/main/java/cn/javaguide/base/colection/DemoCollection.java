package cn.javaguide.base.colection;

import java.util.*;

/**
 * @ClassName DemoCollection
 * @Description
 * @Author Alex
 * @Date 2023/4/28 11:07
 * @Version 1.0
 */
public class DemoCollection {
    public static void main(String[] args) {

        List<String> arraylist = new ArrayList<>();
        arraylist.add("aaaa");

        System.out.println("arraylist = " + arraylist);

        List<String> linklist = new LinkedList<>();
        linklist.add("linklist");
        System.out.println("linklist = " + linklist);

        Map<String, String> hashmap = new HashMap<>();

        hashmap.put("hashmap", "hashmap");

        System.out.println("hashmap = " + hashmap);

//       hashmap.forEach(System.out::printf(k,v));

        Map<String, String> treemap = new TreeMap<>();

        Set<String> set = new HashSet<>();

        Set<String> treeset = new TreeSet<>();

        Queue<String> queue = new ArrayDeque<>();

        Queue<String> proiqueue = new PriorityQueue<>();


    }
}
