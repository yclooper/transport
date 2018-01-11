package com.transport.dao;

import com.transport.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by chen on 2017/12/30.
 */
public interface UserMapper {

    public List<User> findAllUser();

    User findUserByName(String name);

    void update(User user);

    void insert(User user);

    void deleteUser(int id);
}
