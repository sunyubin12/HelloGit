package com.life.hellogit.controller;

import com.life.hellogit.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Gity!";
    }
    @GetMapping("login")
    public String login(){
        return "登录成功!";
    }
}
