package com.anemogai.ace.underwear.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping("/send")
    public String a(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("n.anastasiya020302@mail.ru");
        message.setSubject("Хуй");
        message.setText("хуй хуй хуй хуй");
        this.javaMailSender.send(message);
        return "email";
    }
    @PostMapping("/send")
    public String send(){

        return "aaa";
    }
}
