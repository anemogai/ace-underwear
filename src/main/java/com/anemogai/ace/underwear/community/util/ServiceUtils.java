package com.anemogai.ace.underwear.community.util;

import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ServiceUtils {

    private static ServiceUtils instance;

    @Autowired
    private UserService userService;

    /* Post constructor */

    @PostConstruct
    public void fillInstance() {
        instance = this;
    }

    /*static methods */

    public static UserService getUserService() {
        return instance.userService;
    }
}
