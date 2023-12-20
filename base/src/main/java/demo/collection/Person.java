package demo.collection;

import lombok.ToString;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/11/6 上午10:07
 */
@ToString
public class Person {

    private final String name;

    private final int age;

    private final int height;

    private final int weight;

    private final int id;

    public Person(String name, int age, int height, int weight, int id) {

        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.id = id;
    }

    // 覆盖equals方法用于比较id、age和name属性
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && id == person.id && name.equals(person.name);
    }

    // 覆盖hashCode方法
    @Override
    public int hashCode() {

        return 31 * (name.hashCode() + age) + id;
    }

}
