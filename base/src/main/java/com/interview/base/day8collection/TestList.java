package day8collection;


import java.util.*;

/**
 * @ClassName TestList
 * @Description
 * @Author Alex
 * @Date 2022/6/14 21:30
 * @Version 1.0
 */
public class TestList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.forEach(System.out :: println);
        Collections.sort(list);


        list.add(0, "CC");
        System.out.println("list = " + list);

        list.remove(0);
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());
        list.removeIf(filter->filter.contains("A"));
        list.removeIf(filter->filter.contains("C"));
        System.out.println("list = " + list);

        list.forEach(System.out :: println);

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add(0, "B");
        list1.add(1, "AD");
        list.removeAll(list1);
        list.forEach(System.out :: println);


        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.add("G");

        System.out.println("linkedList = " + linkedList);

        Stack<String> stack = new Stack<>();
        stack.add("a");
        System.out.println("stack = " + stack);
        stack.pop();
        System.out.println("stack = " + stack);


    }

}
