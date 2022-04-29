package com.anemogai.ace.underwear.community.controller;

import com.anemogai.ace.underwear.community.entity.User;
import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class MainPageController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String a(){
        return "sign-up";
    }

    @GetMapping("/login")
    public String m(){
        return "log-in";
    }

    @PostMapping("/signup")
    public void m(@RequestParam String name, @RequestParam String number, @RequestParam String email, @RequestParam String password ){
        LocalDate date = LocalDate.now();
        LocalDate daate = LocalDate.now();
        User user = new User(name, "aa", number, email, password, date, daate);
        userService.addUser(user);
    }



}
