package com.example.simplefitapp.controllers;

import com.example.simplefitapp.user.dtos.UserRegistrationDTO;
import com.example.simplefitapp.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("userRegistrationDTO")
    public UserRegistrationDTO userRegistrationDTO() {
        return new UserRegistrationDTO();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "register";
	}

	@PostMapping
	public String registerUserAccount(
			@ModelAttribute("userRegistrationDTO")
			@Valid UserRegistrationDTO userRegistrationDTO,
			BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {

		if (bindingResult.hasErrors()) {
			redirectAttributes.addFlashAttribute("userRegistrationDTO", userRegistrationDTO);
			redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegistrationDTO", bindingResult);
		return "redirect:/register";
		}

		redirectAttributes.addFlashAttribute("success", "Registration Successful!");
		userService.save(userRegistrationDTO);
		return "redirect:/login";

	}

}
