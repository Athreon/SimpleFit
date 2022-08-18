package com.example.simplefitapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodCartController {

    @GetMapping("/food/cart")
    public String workoutPage() {
        return "food-cart";
    }

}
