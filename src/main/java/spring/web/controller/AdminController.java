/*
package spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import spring.dao.UserDAO;
import spring.dao.UserDAOImpl;
import spring.model.User;
import spring.service.UserService;
import spring.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class AdminController {
    @Autowired
    private UserService userService;
    //метод вывода всего списка
    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String adminPage(Model model) {
        model.addAttribute("userList", userService.getListFromService());
        return "admin";
    }

   */
/* @GetMapping("/{id}")
    public String show(@PathVariable("id")int id,Model model){
        model.addAttribute("user",userService.show(id));
        return "show";
    }*//*

    */
/*@GetMapping()
    public String show(@RequestParam("id")int id,Model model){
        model.addAttribute("user",userService.show(id));
        return "show";
    }*//*


    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/admin";
    }
    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable("id") int id){
        model.addAttribute("user",userService.show(id));
        String role = String.valueOf(userService.show(id).getAuthorities());
        model.addAttribute("role",role);
        return "/edit";
    }
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userService.update(user);
        return "redirect:/admin";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/admin";
    }

  */
/*  @DeleteMapping(value = "/id")
    public String delete(@RequestParam("id") int id, Model model){
        userService.delete(id);
        return "redirect:/admin";
    }*//*


    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC-SECURITY application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "hello";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }



}
*/
