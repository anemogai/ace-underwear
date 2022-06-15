package com.anemogai.ace.underwear.community.controller;

import com.anemogai.ace.underwear.community.entity.User;
import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;
import javax.validation.ValidationException;

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

   /* @PostMapping("/signup")
    public String signUp(@Valid User user, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            return "signupE";
        }
        else userService.addUser(user.getName(), user.getGender(), user.getPassword(), user.getEmail());
        return "redirect:a";
    }*/

    @PostMapping("/signup")
    public ModelAndView signup(@ModelAttribute("user") @Valid User user, BindingResult bindingResult){
        ModelAndView signup = new ModelAndView("signupE");
        ModelAndView done = new ModelAndView("aaa");

        if(userService.existsUser(user.getEmail()) == true) {
            signup.addObject("email", "Email already exists");
        }
        if(bindingResult.hasErrors()){
            return signup;
        }
        else {
            userService.saveUser(user.getName(), user.getGender(), user.getPassword(), user.getEmail());
        }
        return done;
    }




}
