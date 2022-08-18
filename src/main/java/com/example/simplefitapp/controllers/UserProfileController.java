package com.example.simplefitapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {

    public UserProfileController() {
    }

    @GetMapping("/account/settings")
    public String accountSettings() {
        return "account-settings";
    }
//
//    @GetMapping("/account")
//    public String profileOverview() {
//        return "account";
//    }

//    @PostMapping
//    public String profileUpdate(
//            @Valid UserUpdateBindModel userUpdateBindModel,
//            Principal principal) {
//
//        this.userService.updateUser(userUpdateBindModel, Principal());
//
//        return "redirect:/home";
//    }

//    // password update
//    @PostMapping("/account/settings")
//    public GenericResponse changeUserPassword(Locale locale,
//                                              @RequestParam("password") String password,
//                                              @RequestParam("oldpassword") String oldPassword) {
//        User user = validationService.findByEmail(
//                SecurityContextHolder.getContext().getAuthentication().getName());
//
//        if (!validationService.validOldPassword(user, oldPassword)) {
//            try {
//                throw new OldPasswordInvalid("Age is not valid");
//            } catch (OldPasswordInvalid e) {
//                throw new RuntimeException("Not valid");
//            }
//        }
//        validationService.changeUserPassword(user, password);
//        return new GenericResponse(messages.getMessage("message.updatePasswordSuc", null, locale));
//    }


}
