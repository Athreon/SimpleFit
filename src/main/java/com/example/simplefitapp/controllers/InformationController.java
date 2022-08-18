package com.example.simplefitapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformationController {

    @GetMapping("/coaches/mikeinfo")
    public String mikeInfo() {
        return "mikeinfo";
    }

    @GetMapping("/coaches/joinfo")
    public String joInfo() {
        return "joinfo";
    }

    @GetMapping("/coaches/bumsteadinfo")
    public String bumsteadInfo() {
        return "bumsteadinfo";
    }

    @GetMapping("/403")
    public String forbidden() {
        return "403";
    }
}
