package com.example.simplefitapp.base.validations;

import com.example.simplefitapp.coach.repo.CoachRepository;
import com.example.simplefitapp.user.repository.UserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    UserRepository userRepository;
    CoachRepository coachRepository;

    public UniqueEmailValidator(UserRepository userRepository, CoachRepository coachRepository) {
        this.userRepository = userRepository;
        this.coachRepository = coachRepository;
    }

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return this.userRepository.findByEmail(email) == null && this.coachRepository.findByEmail(email) == null;

    }
}