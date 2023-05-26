package com.example.tranbaotu20.Validator.annotation;

import com.example.tranbaotu20.Validator.ValidUsernameValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public class ValidUsername {
    String message() default "Username already exists";
    Class<?>[] group() default {};
    Class<? extends Payload>[] payload() default {};
}

