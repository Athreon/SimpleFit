package com.example.simplefitapp.base.validations;

import com.example.simplefitapp.coach.repo.CoachRepository;
import com.example.simplefitapp.user.repository.UserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    UserRepository userRepository;
    CoachRepository coachRepository;

    public UniqueUsernameValidator(UserRepository userRepository, CoachRepository coachRepository) {
        this.userRepository = userRepository;
        this.coachRepository = coachRepository;
    }

    @Override
    public void initialize(UniqueUsername constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return this.userRepository.findByUsername(username) == null && this.coachRepository.findByUsername(username) == null;
    }
}
