package com.transport.service;

import com.transport.entity.User;

import java.util.List;

/**
 * Created by chen on 2018/1/4.
 */
public interface UserService {

    List<User> findAllUser();

    User findUserByName(String name);
}
