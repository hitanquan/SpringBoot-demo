package com.tan.demo.controller;

import com.tan.demo.entity.User;
import com.tan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.getAllUser();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.addUser(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id) {
        System.out.println("哈哈哈哈哈，id="+id);
        userService.deleteUserById(id);
    }

}
