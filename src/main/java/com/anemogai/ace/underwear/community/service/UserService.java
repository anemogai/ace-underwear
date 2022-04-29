package com.anemogai.ace.underwear.community.service;

import com.anemogai.ace.underwear.community.entity.User;


public interface UserService {

    Iterable<User> getAllUsers();

    User addUser(User user);
}
