package com.example.simplefitapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("home")
	public String welcomePage() {
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
