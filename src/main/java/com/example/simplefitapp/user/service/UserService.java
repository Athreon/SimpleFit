package com.example.simplefitapp.user.service;

import com.example.simplefitapp.user.dtos.UserRegistrationDTO;
import com.example.simplefitapp.user.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDTO registrationDTO);


}
