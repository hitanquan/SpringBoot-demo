package com.tan.demo.service;

import com.tan.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);
}
