package com.group2day02.group2day02.controller;

import com.group2day02.group2day02.exception.UserServiceException;
import com.group2day02.group2day02.request.TaskFilterRequest;
import com.group2day02.group2day02.request.UserCreationRequest;
import com.group2day02.group2day02.request.UserFilterRequest;
import com.group2day02.group2day02.response.TaskResponse;
import com.group2day02.group2day02.response.UserResponse;
import com.group2day02.group2day02.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UsersController {

    private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUserPage() {
        return "user-main-page";
    }

    @PostMapping("/user")
    public String createUser(@RequestParam String name,
                             @RequestParam(name = "user_gender") String gender,
                             @RequestParam int size,
                             Model model){
        try{
            userService.createUser(new UserCreationRequest(name, gender, size));
            model.addAttribute("message", "Dodano użytkownika o imieniu " + name);
        }catch(UserServiceException e){
            model.addAttribute("message", e.getMessage());
        }
        return "start-page";
    }

    @GetMapping("find-user")
    public String getFindUserPage(Model model){
        model.addAttribute("request", new UserFilterRequest());
        List<UserResponse> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "find-user";
    }

    @PostMapping("find-user")
    public String filteredFindUserPage(@ModelAttribute("request") UserFilterRequest userFilterRequest, Model model){
        List<UserResponse> users = userService.getUsers(userFilterRequest);
        model.addAttribute("users", users);
        return "find-user";
    }
}
