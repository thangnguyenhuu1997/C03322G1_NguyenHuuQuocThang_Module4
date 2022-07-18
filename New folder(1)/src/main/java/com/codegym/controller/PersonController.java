package com.codegym.controller;

import com.codegym.model.Person;
import com.codegym.service.IPersonService;
import com.codegym.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {
    private IPersonService personService = new PersonService();
    @GetMapping ("")
    public String list (Model model){
        List <Person> personList = personService.selectAllPerson();
        model.addAttribute("person", personList);
        return "/index";
    }
    @GetMapping ("/create")
    public String create(Model model){
        model.addAttribute("person", new Person());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Person person, RedirectAttributes redirectAttributes) {
        personService.selectAllPerson();

        redirectAttributes.addFlashAttribute("success", "Add product successful!");

        return "redirect:/person";
    }

}