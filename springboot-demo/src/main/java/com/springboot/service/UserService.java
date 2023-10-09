package com.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.entity.User;
import com.springboot.entity.vo.LoginVo;

/**
 * @author LiJiang
 * @since 2021/6/23 15:24
 */
public interface UserService extends IService<User> {

    /**
     * 实现登录功能
     *
     * @param loginVo
     * @return
     */
    boolean login(LoginVo loginVo);

}
