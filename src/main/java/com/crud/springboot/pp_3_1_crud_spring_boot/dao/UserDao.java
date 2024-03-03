package com.crud.springboot.pp_3_1_crud_spring_boot.dao;

import com.crud.springboot.pp_3_1_crud_spring_boot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> getAllUsers();

    User getUser(long id);

    void updateUser(User user);

    void deleteUser(long id);

}
