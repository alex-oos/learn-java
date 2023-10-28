package com.mybatisplus.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Auther: Alex
 * @since 2021/1/22 15:15
 * @Descprition:
 */


@Configuration // 加入到bean里面，让spring进行管理
@MapperScan("com.mybatisplus.mapper")
public class MybatisPlusConfig {

    /**
     * 3.4.0以后的mp版本，推荐用如下的配置方式
     **/
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {

        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL)); // 分页
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());// 乐观锁

        return interceptor;
    }

}
