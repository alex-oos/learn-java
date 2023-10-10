package com.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Auther: 李将
 * @Date: 2021/1/22 14:47
 * @Descprition:
 */
@Slf4j
@Component // 需要注册到Spring容器中
public class MyMetaObjectHandler implements MetaObjectHandler {

    /*
     * 自动补全
     * */

    @Override
    public void insertFill(MetaObject metaObject) {
        // 插入时自动填充
        // 注意第二个参数要填写实体类中的字段名称，而不是表的列名称
        log.info("start insert fill ....");
        strictFillStrategy(metaObject, "createTime", LocalDateTime::now);

    }

    @Override
    public void updateFill(MetaObject metaObject) {

        log.info("start update fill ....");
        // 更新时自动填充
        strictFillStrategy(metaObject, "updateTime", LocalDateTime::now);

    }


}
