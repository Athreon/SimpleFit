package com.example.simplefitapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculator() {
        return "calculate";
    }


}
