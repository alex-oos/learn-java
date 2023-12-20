package demo.collection;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/6 上午10:05
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 查看重复的元素
public class FindDuplicates {

    public static List<Person> findDuplicates(List<Person> list) {

        List<Person> duplicates = new ArrayList<>();
        Map<Person, Integer> countMap = new HashMap<>();

        for (Person person : list) {
            countMap.put(person, countMap.getOrDefault(person, 0) + 1);
        }

        for (Person person : list) {
            if (countMap.get(person) > 1) {
                duplicates.add(person);
                countMap.put(person, 0); // 防止将相同的元素添加多次
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 25, 160, 55, 1));
        list.add(new Person("Bob", 30, 178, 75, 2));
        list.add(new Person("Alice", 25, 160, 55, 1));
        list.add(new Person("Carol", 35, 165, 60, 3));
        list.add(new Person("David", 30, 180, 80, 4));
        list.add(new Person("Bob", 30, 175, 75, 2));

        List<Person> duplicates = findDuplicates(list);

        System.out.println("重复元素：");
        for (Person person : duplicates) {
            System.out.println(person);
        }
    }

}
