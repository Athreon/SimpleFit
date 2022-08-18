package com.example.simplefitapp.coach.repo;

import com.example.simplefitapp.coach.entity.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {

    Coach findByEmail(String email);

    Coach findByUsername(String username);

    Coach findByEmailAndPassword(String email, String password);

}
