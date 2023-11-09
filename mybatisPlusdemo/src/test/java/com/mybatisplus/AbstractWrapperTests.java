package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.mybatisplus.entity.User;
import com.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Alex
 * @since 2021/1/22 18:27
 *  Wrapper ： 条件构造抽象类，最顶端父类
 * AbstractWrapper ： 用于查询条件封装，生成 sql 的 where 条件
 * QueryWrapper ： Entity 对象封装操作类，不是用lambda语法
 * UpdateWrapper ： Update 条件封装，用于Entity对象更新操作
 * AbstractLambdaWrapper ： Lambda 语法使用 Wrapper统一处理解析 lambda 获取 column。
 * LambdaQueryWrapper ：看名称也能明白就是用于Lambda语法使用的查询Wrapper
 * LambdaUpdateWrapper ： Lambda 更新封装Wrapper
 */

@SpringBootTest
public class AbstractWrapperTests {

    @Autowired
    private UserMapper userMapper;


    /*  ge、gt、le、lt、isNull、isNotNull
     *  ge >=
     *  isNUll 为空
     * isNotNull 不为空
     *    逻辑删除，
     *      isnull 是where
     * SQL：UPDATE user SET deleted=1 WHERE deleted=0 AND name IS NULL AND age >= ? AND email IS NOT NULL

     * */

    @Test
    public void TestDelete() {
        // 创建QueryWrapper 对象
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("name").ge("age", 12).isNotNull("email");
        // 逻辑删除
        int result = userMapper.delete(queryWrapper);
        System.out.println(result);
    }

    /*
        eq 等于 ne 不等于
      查询一个字段
    * SELECT id,name,age,email,create_time,update_time,deleted,version FROM user WHERE deleted=0 AND name = ?
        seletOne返回的是一条实体记录，当出现多条时会报错

     * */
    @Test
    public void testSlectOne() {

        QueryWrapper<User> queryWrappe = new QueryWrapper<>();
        queryWrappe.eq("name", "Tom");
        User user = userMapper.selectOne(queryWrappe);
        System.out.println(user);

    }

    /*
     * between 判断在 什么和什么之内
     *  notbetween 不在什么之内
     * SELECT COUNT(1) FROM user WHERE deleted=0 AND age BETWEEN ? AND ?
     *
     * */
    @Test
    public void testSlectCout() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("age", 10, 30);
        Integer count = Math.toIntExact(userMapper.selectCount(queryWrapper));
        System.out.println(count);
    }

    /*
     *  allEq  多个判断，多个等于，需要传入map类型的参数
     *  SELECT id,name,age,email,create_time,update_time,deleted,version FROM user WHERE deleted=0 AND name = ? AND id = ? AND age = ?
     * */
    @Test
    public void testSlectList() {

        QueryWrapper<User> queryWrapper = new QueryWrapper();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", 28);
        map.put("deleted", 0);
        queryWrapper.allEq(map);
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    /*
     * like、notLike、likeLeft、likeRight
     * selectMaps返回Map集合列表
     * SELECT id,name,age,email,create_time,update_time,deleted,version FROM user WHERE deleted=0 AND name NOT LIKE ? AND email LIKE ?
     * */
    @Test
    public void testSelectMaps() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.notLike("name", "T").like("email", "t");
        List<Map<String, Object>> list = userMapper.selectMaps(queryWrapper);
        list.forEach(System.out::println);
    }

    /*
    * in、notIn、inSql、notinSql、exists、notExists
    *in、notIn：
    notIn("age",{1,2,3})--->age not in (1,2,3)
    notIn("age", 1, 2, 3)--->age not in (1,2,3)
    inSql、notinSql：可以实现子查询
    例: inSql("age", "1,2,3,4,5,6")--->age in (1,2,3,4,5,6)
    例: inSql("id", "select id from table where id < 3")--->id in (select id from table where id < 3)
    * */

    @Test
    public void testSelectObjs() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", 1, 2, 3, 4, 5);
        List<Object> objects = userMapper.selectObjs(queryWrapper);
        objects.forEach(System.out::println);

    }

    /*
     * 嵌套or、嵌套and
     * 这里使用了lambda表达式，or中的表达式最后翻译成sql时会被加上圆括号
     * UPDATE user SET name=?, age=?, update_time=?  WHERE deleted=0 AND name LIKE ? OR ( name = ? AND age <> ? )
     * */

    @Test
    public void testUpdate2() {

        User user = new User();
        user.setAge(99);
        user.setName("Andy");
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.like("name", "h").or(i -> i.eq("name", "李白").ne("age", 20));
        int result = userMapper.update(user, userUpdateWrapper);
        System.out.println("result = " + result);

    }

    /*
     * orderBy、orderByDesc、orderByAsc
     * */

    @Test
    public void testSelectListOrderBy() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.orderBy(false, true, "id");
        queryWrapper.orderByAsc("id");
//        queryWrapper.orderByDesc("id");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    /*last
    注意：只能调用一次,多次调用以最后一次为准 有sql注入的风险,请谨慎使用
    * */


    @Test
    public void testSelectListLast() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id").last("limit 1");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
    /*
     * 指定要查询的列
     * select
     * */

    @Test
    public void testSelectListColumn() {

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id", "name", "age");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    /*
     * set、setSql
     * 最终的sql会合并 user.setAge()，以及 userUpdateWrapper.set()  和 setSql() 中 的字段
     * UPDATE user SET age=?, create_time=?, update_time=?, version=?, name=?, email = '123@qq.com' WHERE deleted=0 AND (name LIKE ?)
     * */

    @Test
    public void testUpdateSet() {

        // 修改值
        User user = new User();
        user.setAge(99);
        // 修改条件
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.like("name", "h").set("name", "老李头")// 除了可以查询还可以使用set设置修改的字段
                .setSql(" email = '123@qq.com'");// 可以有子查询
        int result = userMapper.update(user, userUpdateWrapper);
        System.out.println("result = " + result);

    }

}
