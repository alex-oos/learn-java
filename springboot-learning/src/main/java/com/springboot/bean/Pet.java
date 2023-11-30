package com.springboot.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author alex
 * @since
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

    private String name;

    private Integer age;

}
