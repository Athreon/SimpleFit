package com.example.simplefitapp.base.validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MatchingPasswordsValidator.class)
public @interface MatchingPasswords {

    String message() default "Passwords must match.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
