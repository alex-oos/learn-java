package com.springboot.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 李将
 * @Date: 2021/1/21 13:46
 * @Descprition:
 */
@Mapper
@Repository // 也可以使用@Component，效果都是一样的，只是为了声明为bean
public interface UserMapper extends BaseMapper<User> {

    // SQL中不写WHERE关键字，且固定使用${ew.customSqlSegment}
    @Select("select * from user ${ew.customSqlSegment}")
    List<User> findAll(@Param(Constants.WRAPPER) Wrapper<User> wrapper);

}
