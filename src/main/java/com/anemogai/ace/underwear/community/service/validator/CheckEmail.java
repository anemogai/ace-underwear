package com.anemogai.ace.underwear.community.service.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ TYPE, FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = CheckSameEmailValidator.class)
public @interface CheckEmail {

    String message() default "Email already exists";
    Class[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
