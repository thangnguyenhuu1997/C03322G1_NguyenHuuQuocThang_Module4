package com.demo.controller;

import com.demo.service.DictionaryService;
import com.demo.service.IDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {

    private IDictionaryService dictionaryService = new DictionaryService();

    @GetMapping
    public String show() {
        return "index";
    }

    @PostMapping
    public String translate(@RequestParam String english, Model model) {
        String vietnamese = dictionaryService.translate(english);
        model.addAttribute("vietnamese", vietnamese);
        return "index";
    }

}
