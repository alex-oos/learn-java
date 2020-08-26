package com.interview.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 面试总结
 * <p>java引用类型传递,</p>
 *
 * @author LiJiang
 * @since 2021/6/25 11:30
 */

public class JavaCallByValue {


    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }

    public static void main(String[] args) {
        Student s1 = new Student("小张");
        Student s2 = new Student("小李");
        swap(s1, s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
    }


}

@Data
@NoArgsConstructor // 无参构造方法
@AllArgsConstructor // 有参构造方法
class Student {
    private String name;
}