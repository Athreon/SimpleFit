package com.example.simplefitapp.service;

import com.example.simplefitapp.coach.dtos.CoachRegistrationDTO;
import com.example.simplefitapp.coach.entity.Coach;
import com.example.simplefitapp.base.entity.Role;
import com.example.simplefitapp.coach.repo.CoachRepository;
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
public class CoachServiceImpl implements CoachService {

    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public CoachServiceImpl(CoachRepository coachRepository) {
        super();
        this.coachRepository = coachRepository;
    }

    @Override
    public Coach save(CoachRegistrationDTO coachRegistrationDTO) {
        Coach coach = new Coach();
        coach.setUsername(coachRegistrationDTO.getUsername());
        coach.setEmail(coachRegistrationDTO.getEmail());
        coach.setFirstName(coachRegistrationDTO.getFirstName());
        coach.setLastName(coachRegistrationDTO.getLastName());
        coach.setAge(coachRegistrationDTO.getAge());
        coach.setPassword(passwordEncoder.encode(coachRegistrationDTO.getPassword()));
        coach.setRoles(Arrays.asList(new Role("ROLE_COACH")));

        return coachRepository.save(coach);
    }

    @Override
    public UserDetails loadUserByUsername(String em) throws UsernameNotFoundException {

        Coach coach = coachRepository.findByEmail(em);
        if(coach == null) {
            throw new UsernameNotFoundException("Invalid username or password for coach.");
        }
        return new org.springframework.security.core.userdetails.User(coach.getUsername(), coach.getPassword(), mapRolesToAuthorities(coach.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }
}
