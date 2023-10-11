package com.mybatisplus.mapper;

import com.mybatisplus.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author lijiang
 * @since 2023/10/10 下午5:39
 * <P></p>
 */
@SpringBootTest
class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void getUserList() {

        List<User> userList = userMapper.getUserList();
        userList.forEach(System.out::println);

    }

    @Test
    void getUserById() {

        User userById = userMapper.getUserById(1);
        System.out.println("userById.toString() = " + userById.toString());
    }

    @Test
    void addUser() {

        User user = new User();
        user.setAge(18);
        user.setName("小白");
        user.setEmail("demo@qq.com");
        System.out.println("user.toString() = " + user);
        System.out.println("userMapper.addUser(user) = " + userMapper.addUser(user));

    }

    @Test
    void updateUser() {

        User user = userMapper.getUserById(1);
        user.setName("测试数据update操作");
        Boolean b = userMapper.updateUser(user);
        System.out.println("b = " + b);
        User newUser = userMapper.getUserById(1);
        System.out.println("userById1 = " + newUser);


    }

    @Test
    void deleteUser() {

        Boolean b = userMapper.deleteUser(10);
        System.out.println("是否删除成功！" + b);
    }


    @Test
    void queryALLData() {

        List<User> users = userMapper.queryALLData();
        users.forEach(System.out::println);

    }

}
