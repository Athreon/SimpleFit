package com.example.simplefitapp.coach.dtos;

import com.example.simplefitapp.base.validations.MatchingPasswords;
import com.example.simplefitapp.base.validations.UniqueEmail;
import com.example.simplefitapp.base.validations.UniqueUsername;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@MatchingPasswords
public class CoachRegistrationDTO {

    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Integer age;
    private String password;
    private String confirmPassword;

    public CoachRegistrationDTO() {
    }

    public CoachRegistrationDTO(String firstName, String lastName, String username, String email, Integer age, String password, String confirmPassword) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.age = age;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    @NotBlank
    @UniqueUsername
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotBlank
    @Email
    @UniqueEmail
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Size(min = 6, message = "Password must be at least 6 characters long")
    @NotBlank
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Size(min = 2, message = "Please give valid first name")
    @NotBlank
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Size(min = 2, message = "Please give valid last name")
    @NotBlank
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "CoachRegistrationDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
