package com.atguigu.day13.object;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Alex
 * @since 2024/6/17 下午5:50
 * <p></p>
 */
public class FinalizeTest {

    public static void main(String[] args) {

        Person p = new Person("alex", 10);
        System.out.println("p = " + p);
        p = null;  // 置空
        System.gc(); // 垃圾回收
    }

}

@AllArgsConstructor
@Data
class Person {

    private String name;

    private Integer age;

    @Override
    protected void finalize() throws Throwable {

        System.out.println("对象被销毁" + this);

    }

}
