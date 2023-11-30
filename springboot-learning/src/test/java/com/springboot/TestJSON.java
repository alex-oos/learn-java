package com.springboot;


import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import lombok.SneakyThrows;

import java.util.List;

/**
 * @author Alex
 * @since 2021/8/27 8:54 下午
 * <P></p>
 */
public class TestJSON {

    @SneakyThrows
    public static void main(String[] args) {
        // product为表名
        List<cn.hutool.db.Entity> list = Db.use().findAll("t_order");
        for (Entity entity : list) {
            System.out.println(entity.toString());
        }


    }

}
