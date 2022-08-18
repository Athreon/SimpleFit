package com.example.simplefitapp.base.validations;

import com.example.simplefitapp.coach.dtos.CoachRegistrationDTO;
import com.example.simplefitapp.user.dtos.UserRegistrationDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatchingPasswordsValidator implements ConstraintValidator<MatchingPasswords, Object> {

    private String message;

    @Override
    public void initialize(MatchingPasswords matchingPasswords) {
        this.message =matchingPasswords.message();
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        boolean isValid = false;
        if (obj.getClass().equals(UserRegistrationDTO.class)) {
            UserRegistrationDTO userRegistrationDTO = (UserRegistrationDTO) obj;
            isValid = userRegistrationDTO.getPassword().equals(userRegistrationDTO.getConfirmPassword());
        } else if (obj.getClass().equals(CoachRegistrationDTO.class)) {
            CoachRegistrationDTO coachRegistrationDTO = (CoachRegistrationDTO) obj;
            isValid = coachRegistrationDTO.getPassword().equals(coachRegistrationDTO.getConfirmPassword());
        }

        if (!isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate
                            (context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation();
            context.buildConstraintViolationWithTemplate
                            (context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode("password")
                    .addConstraintViolation();
        }
        return isValid;
    }
}
