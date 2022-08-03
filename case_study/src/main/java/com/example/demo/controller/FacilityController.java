package com.example.demo.controller;

import com.example.demo.model.facility.Facility;
import com.example.demo.service.facility.IFacilityService;
import com.example.demo.service.facility.IFacilityTypeService;
import com.example.demo.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IFacilityTypeService facilityTypeService;
    @Autowired
    private IRentTypeService rentTypeService;

    @GetMapping("")
    public String showList(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Sort sort = Sort.by("facilityId").ascending();
        model.addAttribute("facilityList", facilityService.findAll(PageRequest.of(page, 5, sort)));
        model.addAttribute("facility", new Facility());
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "facility/list";
    }

    @GetMapping("/create")
    public String showCreationForm(Model model){
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        model.addAttribute("facility", new Facility());
        return "facility/create";
    }

    @PostMapping("/save")
    public String save(Facility facility, RedirectAttributes redirectAttributes){
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("msg", "Facility created successfully!!");
        return "redirect:/facility";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Integer id, Model model){
        model.addAttribute("facility", facilityService.findById(id));
        model.addAttribute("facilityTypeList", facilityTypeService.findAll());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        return "facility/edit";
    }

    @PostMapping("/update")
    public String update(Facility facility, RedirectAttributes redirectAttributes){
        facilityService.update(facility);
        redirectAttributes.addFlashAttribute("msg", "Facility edited successfully!!");
        return "redirect:/facility";
    }

    @GetMapping("/delete")
    public String delete(Integer serviceId, RedirectAttributes redirectAttributes){
        Optional<Facility> facility = facilityService.findById(serviceId);
        facilityService.remove(facility.get());
        redirectAttributes.addFlashAttribute("msg", "Facility deleted successfully!!");
        return "redirect:/facility";
    }
}
