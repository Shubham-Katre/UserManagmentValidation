package com.geekster.UserManagment.controller;

import com.geekster.UserManagment.model.User;
import com.geekster.UserManagment.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    UserService userservice;

    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody User usermodel){
        return userservice.addNewUser(usermodel);
    }
    @GetMapping("/getAllUser")
    public ArrayList<User> getAllUser(){
        return userservice.getAllUsers();
    }

    @GetMapping("getUser/{userid}")
    public User getUser(@PathVariable int userid){
        return userservice.getUserById(userid);
    }

    @PutMapping("/updateUserInfo/{userid}")
    public String updateUserInfo(@PathVariable int userid , @RequestBody User usermodel){
        return userservice.updateUser(userid , usermodel);
    }
    @DeleteMapping("/deleteUser/{userid}")
    public String deleteUser(@PathVariable int userid){
        return userservice.deleteUserById(userid);
    }
}
