package com.anemogai.ace.underwear.community.service.impl;

import com.anemogai.ace.underwear.community.entity.User;
import com.anemogai.ace.underwear.community.repo.UserRepo;
import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private VerificationTokenService verificationTokenService;

    @Override
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    @Transactional
    public User saveUser(String name, String gender, String password, String phoneNumber) {
        LocalDate createdAt = LocalDate.now();
        LocalDate updatedAt = LocalDate.now();
        return userRepo.save(new User(name, gender, password, phoneNumber, createdAt, updatedAt));
    }

    @Override
    public boolean existsUser(String email) {
        return userRepo.existsByEmail(email);
    }

    @Override
    public User register(User user) {
        User registerUser = new User();

        return user;
    }

    @Override
    @Transactional
    public Optional<User> findUserByEmail(String email) {
        return userRepo.findUserByEmail(email);
    }
}
