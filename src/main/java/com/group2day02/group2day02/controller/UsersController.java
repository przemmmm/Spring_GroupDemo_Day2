package com.group2day02.group2day02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UsersController {

    @GetMapping("/user")
    public String getUserPage() {
        return "user-main-page";
    }
}
