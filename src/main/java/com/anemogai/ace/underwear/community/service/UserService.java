package com.anemogai.ace.underwear.community.service;

import com.anemogai.ace.underwear.community.entity.User;

import java.util.Optional;

public interface UserService {

    Iterable<User> getAllUsers();

    User saveUser(String name, String gender, String password, String email);

    boolean existsUser(String email);

    User register(User user);

    Optional<User> findUserByEmail(String email);
}
