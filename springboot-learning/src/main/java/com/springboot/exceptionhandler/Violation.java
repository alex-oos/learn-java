package com.springboot.exceptionhandler;

import lombok.Data;

/**
 * @ClassName Violation
 * @Description
 * @Author Alex
 * @Date 2023/10/22 18:48
 * @Version 1.0
 */

@Data
public class Violation {

    private final String fieldName;

    private final String message;


}
