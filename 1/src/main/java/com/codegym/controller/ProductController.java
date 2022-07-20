package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String list(Model model){
        List<Product> productList = iProductService.selectAllProduct();
        model.addAttribute("productList",productList);
        return "/index";
    }
    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iProductService.remove(product.getId());

        redirect.addFlashAttribute("success", "Removed product successfully!");

        return "redirect:/product";
    }
    @PostMapping("search")
    public String search(@RequestParam String keyword, Model model) {
        List<Product> productList = iProductService.searchProduct(keyword);
        model.addAttribute("productList", productList);
        return "/index";
    }
}
