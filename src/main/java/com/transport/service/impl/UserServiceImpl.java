package com.transport.service.impl;

import com.transport.dao.UserMapper;
import com.transport.entity.User;
import com.transport.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chen on 2018/1/4.
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    public User findUserByName(String name) {
        return userMapper.findUserByName(name);
    }

    public void insert(User user) {
        userMapper.insert(user);
    }

    public void update(User user) {
        userMapper.update(user);
    }

    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }
}
