package com.mybatisplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @MapperScan("com.baomidou,mybatisplus.mapper") // 默认扫描mapper下的包，使用@MapperScan 可以替代 @Mapper
public class MybatisPlusApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisPlusApplication.class, args);
    }

}
