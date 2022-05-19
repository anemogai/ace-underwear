package com.anemogai.ace.underwear.community.service.validator;

import com.anemogai.ace.underwear.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckSameEmailValidator implements ConstraintValidator<CheckEmail, String> {

    @Autowired
    private UserService userService;

    @Override
    public void initialize(CheckEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return userService.existsUser(email) == false;
    }
}
