package com.anemogai.ace.underwear.community.service.impl;

import com.anemogai.ace.underwear.community.entity.User;
import com.anemogai.ace.underwear.community.repo.UserRepo;
import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User addUser(String name, String gender, String password, String phoneNumber, String email) {
        LocalDate createdAt = LocalDate.now();
        LocalDate updatedAt = LocalDate.now();
        return userRepo.save(new User(name, gender, password, phoneNumber, email, createdAt, updatedAt));
    }
}
