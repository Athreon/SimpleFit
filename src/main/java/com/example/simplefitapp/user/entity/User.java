package com.example.simplefitapp.user.entity;

import com.example.simplefitapp.base.entity.BaseEntity;
import com.example.simplefitapp.base.entity.Role;
import com.example.simplefitapp.foodcart.mealtable.MealTable;
import com.example.simplefitapp.user.enums.UserExperience;

import javax.persistence.*;
import java.util.Collection;

@javax.persistence.Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "username", unique = true,  nullable = false, length = 20)
    private String username;

    @Column(nullable = false, length = 300)
    private String password;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Enumerated(EnumType.STRING)
    private UserExperience userExperience;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private MealTable mealTable;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
    }

    public MealTable getMealTable() {
        return mealTable;
    }

    public void setMealTable(MealTable mealTable) {
        this.mealTable = mealTable;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public UserExperience getUserExperience() {
        return userExperience;
    }

    public void setUserExperience(UserExperience userExperience) {
        this.userExperience = userExperience;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
