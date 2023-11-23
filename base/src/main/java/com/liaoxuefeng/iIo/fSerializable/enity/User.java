package com.liaoxuefeng.iIo.fSerializable.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

/**
 * <p>
 * JavaBean本身就是一个类，它需要满足如下要求：
 * 所有的类放在一个包中
 * 类必须声明为public
 * 类的属性必须要封装起来
 * 需要提供get、set方法
 * 至少存在一个无参构造方法
 * 需要继承Serializable接口
 * </p>
 * @author Alex
 * @since 2021/6/25 16:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = UUID.randomUUID().getMostSignificantBits();

    private String name;

    private int age;


}
