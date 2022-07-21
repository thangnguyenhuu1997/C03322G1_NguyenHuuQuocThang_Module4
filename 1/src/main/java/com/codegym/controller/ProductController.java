package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping
    public String showProductList(Model model){
        List<Product> productList = iProductService.selectAllProduct();
        model.addAttribute("productList", productList);
        return "index";
    }
    @GetMapping("create")
    public String showFormCreate(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping("create")
    public String create(@ModelAttribute("product") Product product) {
        iProductService.insertProduct(product);
        return "redirect:/index";
    }
    @GetMapping("edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.selectProduct(id));
        return "edit";
    }
    @PostMapping("update")
    public String edit(@ModelAttribute("product") Product product) {
        iProductService.update(product.getId(), product);
        return "redirect:/index";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id) {
        iProductService.remove(id);
        return "redirect:/index";
    }
}
