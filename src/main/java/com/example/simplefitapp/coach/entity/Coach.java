package com.example.simplefitapp.coach.entity;

import com.example.simplefitapp.base.entity.BaseEntity;
import com.example.simplefitapp.base.entity.Role;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.Collection;

@javax.persistence.Entity
@Table(name = "coaches")
public class Coach extends BaseEntity {

    @Column(name = "username", unique = true,  nullable = false, length = 20)
    private String username;

    @Column(nullable = false, length = 300)
    private String password;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(name = "first_name", nullable = false, length = 35)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 35)
    private String lastName;

    @Column(name = "age", nullable = false)
    @Digits(integer = 200, fraction = 0, message = "Number should be no larger than 200!")
    private Integer age;

    public Coach() {
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "coaches_roles",
            joinColumns = @JoinColumn(
                    name = "coach_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
}
