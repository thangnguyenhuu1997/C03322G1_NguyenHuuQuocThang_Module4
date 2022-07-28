package com.example.demo.controller;

import com.example.demo.dto.CartDto;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@SessionAttributes ("cart")
@Controller
@RequestMapping (value = "/shop")
public class ProductController {
    @ModelAttribute ("cart")
    public CartDto initCart() {
        return new CartDto();
    }
    @Autowired
    IProductService iProductService;
    @GetMapping
    public ModelAndView showListPage (Model model, @CookieValue (value = "idProduct",defaultValue = "-1") Long idProduct){
        if (idProduct != -1){
            model.addAttribute("historyProduct", iProductService.findById(idProduct).get());
        }
        return new  ModelAndView("product/list","productList",iProductService.findAll());
    }
    @GetMapping ("detail {id}")
    public ModelAndView showDetail(@PathVariable long id, HttpServletResponse response){
        Cookie cookie = new Cookie("idProduct",id+ "");
        cookie.setMaxAge(1*24*60*60);
        cookie.setPath("/");
        response.addCookie(cookie);

        return new ModelAndView("product/detail","product",iProductService.findById(id).get());
    }
}
