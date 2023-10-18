package com.liaoxuefeng.hCollection.eTreeMap;

import com.liaoxuefeng.hCollection.cMap.Person;
import com.liaoxuefeng.hCollection.cMap.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @autoer Alex
 * @since: 2020/6/11 14:49
 * @Descprition: SortedMap在遍历时严格按照Key的顺序遍历，最常用的实现类是TreeMap；
 * <p>
 * 作为SortedMap的Key必须实现Comparable接口，或者传入Comparator；
 * <p>
 * 要严格按照compare()规范实现比较逻辑，否则，TreeMap将不能正常工作。
 */
public class Main {


    // 排序：SortedMap 保证遍历的时，按照key的顺序来排序，例如，放入的Key是"apple"、"pear"、"orange"，遍历的顺序一定是"apple"、"orange"、"pear"，因为String默认按字母排序：
    public static void f() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("pear", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);

        }
    }

    /*    使用TreeMap时，放入的Key必须实现Comparable接口。String、Integer这些类已经实现了Comparable接口，因此可以直接作为Key使用。作为Value的对象则没有任何要求。
        如果作为Key的class没有实现Comparable接口，那么，必须在创建TreeMap时同时指定一个自定义排序算法：
        意到Comparator接口要求实现一个比较方法，它负责比较传入的两个元素a和b，如果a<b，则返回负数，通常是-1，如果a==b，则返回0，如果a>b，则返回正数，通常是1。TreeMap内部根据比较结果对Key进行排序。
    从上述代码执行结果可知，打印的Key确实是按照Comparator定义的顺序排序的。如果要根据Key查找Value，我们可以传入一个new Person("Bob")作为Key，它会返回对应的Integer值2。
    另外，注意到Person类并未覆写equals()和hashCode()，因为TreeMap不使用equals()和hashCode()。

        */
    public static void f1() {
        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        map.put(new Person("liu"), 1);
        map.put(new Person("wang"), 2);
        map.put(new Person("li"), 3);

        System.out.println("map = " + map);
        for (Person key : map.keySet()) {
            System.out.println("key = " + key);
        }
        System.out.println(map.get(new Person("liu")));

    }

    public static void f2() {
        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() > o2.getScore() ? -1 : 1;
            }
        });

        map.put(new Student("Aiuyan", 77), 1);
        map.put(new Student("Dixue", 88), 2);
        map.put(new Student("Bilty", 99), 33);
        for (Map.Entry<Student, Integer> entry : map.entrySet()) {
            Student key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("map.get(\"liuyan\",77) = " + map.get(new Student("liuyan", 66)));

    }

    public static void main(String[] args) {

      /*  f();
        f1();*/
        f2();

    }
}
