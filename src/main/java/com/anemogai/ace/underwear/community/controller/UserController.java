package com.anemogai.ace.underwear.community.controller;

import com.anemogai.ace.underwear.community.entity.User;
import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Validated
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
    public String signup(ModelMap model){
        model.addAttribute("user", new User());
        return "signupE";
    }

    @PostMapping("/signup")
    public String m(ModelMap model, @ModelAttribute ("user") @Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "signup";
        }

        userService.addUser(user.getName(), user.getGender(), user.getPassword(), user.getPhoneNumber(), user.getEmail());
        model.clear();
        return "redirect:a";
    }



}
