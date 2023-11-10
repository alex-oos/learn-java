package com.springboot.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.entity.User;
import com.springboot.entity.vo.LoginVo;
import com.springboot.mapper.Usermapper;
import com.springboot.service.UserService;
import com.springboot.utils.MD5;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author Alex
 * @since 2021/6/23 15:24
 */
@Service
public class UserServiceImpl extends ServiceImpl<Usermapper, User> implements UserService {

    @Override
    public boolean login(LoginVo loginVo) {

        String name = loginVo.getUsername();
        String password = loginVo.getPassword();
        if ("".equals(name) || "".equals(password)) {
            return false;
        }

        User user = baseMapper.selectOne(new QueryWrapper<User>().eq("name", name));


        if (StringUtils.hasText((CharSequence) user)) {
            return false;
        }

        return name.equals(user.getUsername()) && MD5.encrypt(password).equals(user.getPassword());
    }

}
