package com.springboot.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Auther: Alex
 * @since 2021/1/22 14:47
 *
 */

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        // 插入时自动填充
        // 注意第二个参数要填写实体类中的字段名称，而不是表的列名称
        strictFillStrategy(metaObject, "createTime", LocalDateTime::now);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 更新时自动填充
        strictFillStrategy(metaObject, "updateTime", LocalDateTime::now);
    }

}
