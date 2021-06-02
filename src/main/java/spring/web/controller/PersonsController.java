package spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.model.Person;
import spring.service.PersonService;


@Controller
public class PersonsController {
    @Autowired
    private PersonService personService;

    @GetMapping()
    public String allUserList(Model model) {
        model.addAttribute("userList", personService.getListFromService());
        return "index";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id,Model model){
        model.addAttribute("person", personService.show(id));
        return "show";
    }
    @GetMapping("/new")
    public String newUser(@ModelAttribute("person") Person person) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person) {
        personService.save(person);
        return "redirect:/admin";
    }
    @GetMapping("/{id}/edit")
    public String edit(Model model,@PathVariable("id") int id){
        model.addAttribute("person", personService.show(id));
        return "/edit";
    }
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("person") Person person, @PathVariable("id") int id) {
        personService.update(person);
        return "redirect:/admin";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        personService.delete(id);
        return "redirect:/admin";
    }
}
