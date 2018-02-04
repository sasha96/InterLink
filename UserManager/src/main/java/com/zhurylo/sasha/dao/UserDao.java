package com.zhurylo.sasha.dao;

import com.zhurylo.sasha.model.User;

import java.util.List;

public interface UserDao {
     void addUser(User user);

     void updateUser(User user);

     void removeUser(int id);

     User getUserById(int id);

     List<User> listUsers();
}
