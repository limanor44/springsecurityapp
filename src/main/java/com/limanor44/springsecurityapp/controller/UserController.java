package com.limanor44.springsecurityapp.controller;

import com.limanor44.springsecurityapp.models.User;
import com.limanor44.springsecurityapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/getAll")
    public List<User> getAll() {
        return userService.findAll();
    }

    @PostMapping("/users/create")
    public User createUser(@RequestParam String username,
                           @RequestParam String firstname,
                           @RequestParam String lastname,
                           @RequestParam String password,
                           @RequestParam String email) {

        return userService.saveUser(new User(username, firstname, lastname, password, email));
    }

    @DeleteMapping("/users/remove")
    public void deleteUser(@RequestParam Long id) {
        try {
            userService.removeUser(id);
        } catch (EmptyResultDataAccessException e) {

        }


    }

}
