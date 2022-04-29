package com.anemogai.ace.underwear.community.service.impl;

import com.anemogai.ace.underwear.community.entity.User;
import com.anemogai.ace.underwear.community.repo.UserRepo;
import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }
}
