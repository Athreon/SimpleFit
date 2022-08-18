package com.example.simplefitapp.service;

import com.example.simplefitapp.coach.dtos.CoachRegistrationDTO;
import com.example.simplefitapp.coach.entity.Coach;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface CoachService extends UserDetailsService {

    Coach save(CoachRegistrationDTO coachRegistrationDTO);


}
