package com.example.demo.controller;

import com.example.demo.model.customer.Customer;
import com.example.demo.service.customer.ICustomerService;
import com.example.demo.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping("")
    public String home(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("customer_name").ascending();
        Page<Customer> customerList = iCustomerService.findAllCustomer(PageRequest.of(page, 5, sort));

        model.addAttribute("customerList", customerList);
        model.addAttribute("customer", new Customer());
        return "/customer/list";
    }


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
            return "/customer/create";
        } else {
            iCustomerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "Add new successful");
            return "redirect:/customer";
        }
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", iCustomerService.findByIdCustomer(id));
        model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
        return "/customer/edit";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("typeList", iCustomerTypeService.getAllCustomerType());
            return "customer/edit";
        }
        else {
            iCustomerService.update(customer);
            redirectAttributes.addFlashAttribute("message", "Update successful");
            return "redirect:/customer";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        System.out.println("id" + id);
        iCustomerService.delete(id);
        redirectAttributes.addFlashAttribute("message", "Delete successful");
        return "redirect:/customer";
    }
    @GetMapping("/search")
    public String searchCustomer(@RequestParam(name = "page", defaultValue = "0") int page, Customer customer, Model model) {
        Sort sort = Sort.by("customer_id").ascending();
        model.addAttribute("customerList", iCustomerService.findAllCustomerByName(PageRequest.of(page, 2, sort), customer));
        return "/customer/list";
    }
}