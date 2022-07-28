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
    private IProductService iproductService;

    @GetMapping("")
    public String index(Model model) {
        List<Product> products = iproductService.findAll();
        model.addAttribute("products", products);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        iproductService.save(product);

        redirectAttributes.addFlashAttribute("success", "Add product successful!");

        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirect) {
        iproductService.update(product.getId(), product);

        redirect.addFlashAttribute("success", "Update product successfully!");

        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iproductService.remove(product.getId());

        redirect.addFlashAttribute("success", "Removed product successfully!");

        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iproductService.findById(id));
        return "/view";
    }

    @PostMapping("search")
    public String search(@RequestParam String keyword, Model model) {
        List<Product> products = iproductService.search(keyword);
        model.addAttribute("products", products);
        return "/index";
    }
}
