package com.tan.demo.mapper;

import com.tan.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAllUser();

    void insertUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);
}
