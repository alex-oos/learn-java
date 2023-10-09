package com.springboot.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author alex
 * @Date: 2021/1/21 13:46
 * @descprition:
 */
//@Mapper
@Repository // 也可以使用@Component，效果都是一样的，只是为了声明为bean
public interface Usermapper extends BaseMapper<User> {

}
