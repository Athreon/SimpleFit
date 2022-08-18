package com.example.simplefitapp.user.service;


import com.example.simplefitapp.base.entity.Role;
import com.example.simplefitapp.coach.entity.Coach;
import com.example.simplefitapp.coach.repo.CoachRepository;
import com.example.simplefitapp.user.dtos.UserRegistrationDTO;
import com.example.simplefitapp.user.entity.User;
import com.example.simplefitapp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDTO userRegistrationDTO) {
        User user = new User();
        user.setUserExperience(userRegistrationDTO.getUserExperience());
        user.setUsername(userRegistrationDTO.getUsername());
        user.setEmail(userRegistrationDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userRegistrationDTO.getPassword()));
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String em) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(em);
        Coach coach = coachRepository.findByEmail(em);

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
        }
        if (coach != null) {
            return new org.springframework.security.core.userdetails.User(coach.getUsername(), coach.getPassword(), mapRolesToAuthorities(coach.getRoles()));
        }
        throw new UsernameNotFoundException("Invalid email or password.");
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    public void updateUser(UserModel userModel, Principal principal) {
//        User user = this.userRepository.findByEmail(principal.getName());
//            user.setUsername(userModel.getUsername());
//            user.setEmail(userModel.getEmail());
//            this.userRepository.save(user);
//    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
