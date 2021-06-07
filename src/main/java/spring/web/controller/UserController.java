package spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.service.UserService;



@Controller
public class UserController {
    @Autowired
    private UserService userService;
   /*
    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id,Model model) {
        model.addAttribute("user", userService.show(id));
        return "user";
    }*/
    @GetMapping("/user")
    //public String showUser(Model model, @ModelAttribute("user") User user) {
    public String showUser(Model model, Authentication authentication) {
        model.addAttribute("user", userService.getUserByLogin(authentication.getName()));
        return "user";
    }



}
