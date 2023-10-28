package com.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.mybatisplus.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Alex
 * @since 2021/1/21 13:46
 * @Descprition:
 */
@Mapper
@Repository // 也可以使用@Component，效果都是一样的，只是为了声明为bean
public interface UserMapper extends BaseMapper<User> {

    /**
     * 接口绑定方式：
     * 方式一： 通过映射文件xml方式进行绑定，指定xml映射文件中的namespace对应的接口的全路径名
     * 方式二： 使用注解，在接口的方法上面添加@Select@Update等注解，里面写上对应的SQL语句进行SQL语句的绑定
     */

    // 方式一： 通过映射文件xml方式进行绑定，指定xml映射文件中的namespace对应的接口的全路径名
    // 根据id查询用户


    List<User> selectAllUser();

    // mybatis 传递参数：
    // 方式一：使用 @Param 这种一般只能传 单个参数，建议参数少于5个，查看的时候更加直观
    User selectUserById(@Param("id") Integer id);

    // 新增用户
    // 方式二：传递java bean 传递多个参数
    Boolean insertUser(User user);

    Boolean updateUser(User user);

    Boolean deleteUser(Integer id);

    // -------------------------------------------------------------------------------------------------------------------------------
    // 方式二： 使用注解，在接口的方法上面添加@Select@Update等注解，里面写上对应的SQL语句进行SQL语句的绑定

    // SQL中不写WHERE关键字，且固定使用${ew.customSqlSegment}
    @Select("select * from user ${ew.customSqlSegment}")
    List<User> findAll(@Param(Constants.WRAPPER) Wrapper<User> wrapper);

    @Select("select  * from user where id =#{id}")
    List<User> queryUserById(@Param("id") Integer id);

    @Insert("insert into user(name, age, email) values ( #{name}, #{age}, #{email}) ")
    Boolean insertUserOne(User user);

    @Update(" update user set name = #{name} where id =#{id}")
    Boolean updateUserOne(User user);

    @Delete("delete from user where id = #{id}")
    Boolean deleteUserOne(@Param("id") Integer id);


}
