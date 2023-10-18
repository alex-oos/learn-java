package com.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatisplus.entity.User;
import com.mybatisplus.mapper.UserMapper;
import com.mybatisplus.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Auther: 唐凯泽
 * @since: 2021/5/31 下午 9:56
 * @Descprition:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
