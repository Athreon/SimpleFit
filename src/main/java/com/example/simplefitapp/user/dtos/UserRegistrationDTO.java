package com.example.simplefitapp.user.dtos;

import com.example.simplefitapp.user.enums.UserExperience;
import com.example.simplefitapp.base.validations.MatchingPasswords;
import com.example.simplefitapp.base.validations.UniqueEmail;
import com.example.simplefitapp.base.validations.UniqueUsername;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MatchingPasswords
public class UserRegistrationDTO {

    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private UserExperience userExperience;

    public UserRegistrationDTO() {
    }

    public UserRegistrationDTO(String username, String email, String password, String confirmPassword, UserExperience userExperience) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.userExperience = userExperience;
    }

    public boolean samePasswords() {
       return this.password.equals(this.confirmPassword);
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

    @NotBlank(message = "Please use valid email")
    @UniqueEmail
    @Email
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

    @NotBlank(message = "Password can't be empty")
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @NotNull
    public UserExperience getUserExperience() {
        return userExperience;
    }

    public void setUserExperience(UserExperience userExperience) {
        this.userExperience = userExperience;
    }

    @Override
    public String toString() {
        return "UserRegistrationDTO{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", userExperience=" + userExperience +
                '}';
    }
}
