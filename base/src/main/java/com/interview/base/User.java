package com.interview.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Alex
 * @since 2021/6/25 16:48
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    private int age;
}
