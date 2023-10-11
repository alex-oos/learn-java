package com.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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


    // xml 映射
    @Test
    void selectUserById() {

        User userById = userMapper.selectUserById(1);
        System.out.println("userById.toString() = " + userById.toString());
    }

    @Test
    void insertUser() {

        User user = new User();
        user.setAge(18);
        user.setName("小白");
        user.setEmail("demo@qq.com");
        System.out.println("userMapper.addUser(user) = " + userMapper.insertUser(user));

    }

    @Test
    void updateUser() {

        User user = userMapper.selectUserById(1);
        user.setName("测试数据update操作");
        Boolean b = userMapper.updateUser(user);
        System.out.println("b = " + b);
        User newUser = userMapper.selectUserById(1);
        System.out.println("userById1 = " + newUser);


    }

    @Test
    void deleteUser() {

        Boolean b = userMapper.deleteUser(10);
        System.out.println("是否删除成功！" + b);
    }

    // --------------------------------------------------------------------------------------------------------------------

    @Test
    void findAll() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1);
        List<User> users = userMapper.findAll(queryWrapper);
        users.forEach(System.out::println);

    }

    @Test
    void queryUserOne() {

        List<User> users = userMapper.queryUserById(1);
        users.forEach(System.out::println);

    }

    @Test
    void insertUserOne() {

        User user = new User();
        user.setName("注解：测试插入功能");
        Boolean b = userMapper.insertUserOne(user);
        System.out.println("数据插入是否成功： " + b);

    }

    @Test
    void updateUserOne() {

        User user = new User();
        user.setId(1L);
        user.setName("注解：测试更新功能");
        Boolean b = userMapper.updateUserOne(user);
        System.out.println("数据是否更新成功：" + b);

    }

    @Test
    void deleteUserOne() {

        Boolean b = userMapper.deleteUserOne(2);
        System.out.println("数据是否删除成功：" + b);

    }

}
