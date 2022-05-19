package com.anemogai.ace.underwear.community.service;

import com.anemogai.ace.underwear.community.entity.User;

public interface UserService {

    Iterable<User> getAllUsers();

    User addUser(String name, String gender, String password, String email);

    boolean existsUser(String email);
}
