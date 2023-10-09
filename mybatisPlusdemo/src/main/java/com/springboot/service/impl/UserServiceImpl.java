package com.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.entity.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Auther: 唐凯泽
 * @Date: 2021/5/31 下午 9:56
 * @Descprition:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
