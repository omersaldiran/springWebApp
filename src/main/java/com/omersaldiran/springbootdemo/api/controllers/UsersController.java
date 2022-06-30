package com.omersaldiran.springbootdemo.api.controllers;

import com.omersaldiran.springbootdemo.business.abstracts.UserService;
import com.omersaldiran.springbootdemo.core.entities.User;
import com.omersaldiran.springbootdemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(User user){
        return ResponseEntity.ok(this.userService.add(user)) ;
    }
}
