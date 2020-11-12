package com.tts.userapi.controller;

import com.tts.userapi.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String getUsers() {
        return "";
    }
}
