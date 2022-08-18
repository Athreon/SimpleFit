package com.example.simplefitapp.base.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class LoginDTO {

    //:TODO ADD IF HAVE TIME EMAIL OR USERNAME TO LOG IN
    private String email;

    private String password;

    public LoginDTO() {
    }

    public String getEmail() {
        return email;
    }

    @NotBlank(message = "Please use valid email.")
    @Size(min = 3, max = 20)
    public void setEmail(String email) {
        this.email = email;
    }

    @NotBlank(message = "Please use valid password.")
    @Size(min = 3, max = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
