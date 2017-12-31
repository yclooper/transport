package com.transport.dao;

import com.transport.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by chen on 2017/12/30.
 */
public interface UserMapper {

    public User findUserByCarId(int carId) throws SQLException;

    public User findUserById(int id) throws SQLException;

    public User findUserByCarNo(String carNumber) throws SQLException;

    public User findUserByName(String name) throws SQLException;

    public int addUser(User user) throws SQLException;

    public List<User> findAllUser() throws SQLException;
}
