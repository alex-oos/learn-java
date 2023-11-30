package com.springboot.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alex
 * @since <p>
 * 用户
 * </P>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

}
