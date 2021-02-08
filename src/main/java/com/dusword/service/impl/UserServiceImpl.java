package com.dusword.service.impl;

import com.dusword.entity.User;
import com.dusword.mapper.UserMapper;
import com.dusword.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lixiangjie
 * @since 2021-02-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
