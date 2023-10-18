package com.springboot.exceptionhandler;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ValidationErrorResponse
 * @Description
 * @Author Alex
 * @Date 2023/10/22 18:48
 * @Version 1.0
 */
@Data
public class ValidationErrorResponse {

    private List<Violation> violations = new ArrayList<>();

}
