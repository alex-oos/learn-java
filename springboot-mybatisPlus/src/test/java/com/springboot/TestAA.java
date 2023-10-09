package com.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Auther: 唐凯泽
 * @Date: 2021/5/31 下午 10:02
 * @Descprition:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAA {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test3() {

        User user = new User();
        user.setName("黄");
        QueryWrapper<User> wrapper = new QueryWrapper<>(user);
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }

}
