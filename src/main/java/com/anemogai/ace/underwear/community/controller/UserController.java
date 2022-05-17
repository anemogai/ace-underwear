package com.anemogai.ace.underwear.community.controller;

import com.anemogai.ace.underwear.community.entity.User;
import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "loginE";
    }

    @GetMapping("/a")
    public String a(){
        return "aaa";
    }

    @GetMapping("/signup")
    public String signup(@ModelAttribute("user") User user){
        return "signupE";
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute("user") @Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "signupE";
        }
        userService.addUser(user.getName(), user.getGender(), user.getPassword(), user.getEmail());
        return "redirect:a";
    }



}
