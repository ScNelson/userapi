package com.tts.userapi.controller;

import com.tts.userapi.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/")
    public String getUsers() {
        return "";
    }
}
