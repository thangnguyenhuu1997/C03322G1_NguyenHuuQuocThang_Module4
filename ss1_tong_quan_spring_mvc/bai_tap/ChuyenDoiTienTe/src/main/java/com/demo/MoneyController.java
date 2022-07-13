package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.demo.service.IMoneyService;

@Controller
public class MoneyController {
    @Autowired
    IMoneyService moneyService;
    @GetMapping
    public String showConvert() {
        return "index";
    }
    @PostMapping
    public String convert(@RequestParam double usd, Model model){
        double result = moneyService.resultExchange(usd);
        model.addAttribute("result",result);
        return "index";
    }
}
