package com.springboot;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseSqlTest {


    @Autowired
    private UserMapper userMapper;


    /**
     * 查询所有的数据
     */

    @Test
    public void testSelectAll() {

        List<User> userList = userMapper.selectList(null);
        assertEquals(7, userList.size());
        userList.forEach(System.out::println); // 遍历输出

    }

    /**
     * 添加一个用户,自动插入一个id
     */
    @Test
    public void testInsert() {

        User user = new User();
        user.setName("Jack");
        user.setEmail("liuyan@qq.com");
        user.setAge(20);
        user.setManagerId(2L);
        int insert = userMapper.insert(user);
        System.out.println("insert : " + insert); // 影响的行数
        System.out.println("user = " + user);// Id 自动递增
    }

    /**
     * id修改用户
     */
    @Test
    public void updateUserAge() {

        User user = new User();
        user.setId(2L);
        user.setAge(120);
        int row = userMapper.updateById(user);
        System.out.println("row = " + row);
    }

    /*
     *   测试乐观锁插件
     * */
    @Test
    public void testOptimisticLocker() {

        User user = userMapper.selectById(1L);
        user.setName("hello Yap");
        user.setEmail("hello@qq.com");
        userMapper.updateById(user);
    }

    /*
     *  乐观锁失败
     * */
    @Test
    public void testOptimisticLockerFail() {

        User user = userMapper.selectById(1L);
        user.setName("hello Yap");
        user.setEmail("hello@qq.com");
        user.setVersion(1);
        user.setVersion(user.getVersion() + 1);
        userMapper.updateById(user);
    }

    /*
     *   单个id去查询
     * */
    @Test
    public void testSelectById() {

        User user = userMapper.selectById(1L);
        System.out.println("user = " + user);
    }

    /*
     *  多个id 去查询
     * */
    @Test
    public void testSelectBatchIds() {

        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
//        System.out.println("user = " + user);
    }

    /*
     *  按照map去查询
     * ：map中的key对应的是数据库中的列名。例如数据库user_id，实体类是userId，这时map的key需要填写user_id
     * */
    @Test
    public void selectByMap() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "HELLO");
        map.put("age", 10);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    /**
     * 分页查询
     */
    @Test
    public void selectPage() {
        // 1 创建page对象
        // 传入两个参数：当前页 和 每页显示记录数
        Page<User> page = new Page<>(2, 2);
        // 调用mp分页查询的方法
        // 调用mp分页查询过程中，底层封装
        // 把分页所有数据封装到page对象里面
        Page<User> userPage = userMapper.selectPage(page, null);

        // 通过page对象获取分页数据
        System.out.println("当前页：" + userPage.getCurrent());// 当前页
        System.out.println("每页的List集合：" + userPage.getRecords());// 每页数据list集合
        System.out.println("每页显示记录数：" + userPage.getSize());// 每页显示记录数
        System.out.println("总数" + userPage.getTotal()); // 总记录数
        System.out.println("总页数" + userPage.getPages()); // 总页数

        System.out.println(userPage.hasNext()); // 下一页
        System.out.println(userPage.hasPrevious()); // 上一页
        // 获取分页查询结果
        List<User> records = page.getRecords();
        records.forEach(System.out::println);
    }

    /*
     * 单个id进行删除
     * */
    @Test
    public void deleteById() {

        int result = userMapper.deleteById(8L);
        System.out.println("result = " + result);
    }

    /*
     * 批量删除
     * */
    @Test
    public void deleteBatchIds() {

        int result = userMapper.deleteBatchIds(Arrays.asList(8, 9, 10));
        System.out.println("result = " + result);
    }

    /*
     * 根据查询条件进行删除
     * */
    @Test
    public void testDeleteByMap() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Helen");
        map.put("age", 18);
        int result = userMapper.deleteByMap(map);
        System.out.println("result = " + result);
    }


    /* 测试逻辑删除
     * */

    @Test
    public void testLoginDelete() {

        int result = userMapper.deleteById(1L);
        System.out.println(result);
    }


}
