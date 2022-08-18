package com.example.simplefitapp.controllers;


import com.example.simplefitapp.coach.dtos.CoachRegistrationDTO;
import com.example.simplefitapp.service.CoachService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/register/coach")
public class CoachController {

    // COACH

//    @InitBinder
//    public void initBinder(WebDataBinder dataBinder) {
//        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
//        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
//    }

    private CoachService coachService;

    public CoachController(CoachService coachService) {
        super();
        this.coachService = coachService;
    }

    @ModelAttribute("coachRegistrationDTO")
    public CoachRegistrationDTO innitCoachRegistrationDTO() {
        return new CoachRegistrationDTO();
    }

    @GetMapping
    public String registerCoach() {
        return "register-coach";
    }

    @PostMapping
    public String registerCoach(
            @ModelAttribute("coachRegistrationDTO")
            @Valid CoachRegistrationDTO coachRegistrationDTO,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("coachRegistrationDTO", coachRegistrationDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.coachRegistrationDTO", bindingResult);
            return "redirect:/register/coach";
        }

        redirectAttributes.addFlashAttribute("success", "Registration Successful!");
        coachService.save(coachRegistrationDTO);
        return "redirect:/login";

    }
}
