package com.example.apirest.controller;

import com.example.apirest.UserService;
import com.example.apirest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
     private UserService userService;

     @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("{id}")
    public  User searchUserById(@PathVariable("id") Long id){
         return userService.getUserById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable ("id")Long id){
         userService.deleteUser(id);
    }
}
