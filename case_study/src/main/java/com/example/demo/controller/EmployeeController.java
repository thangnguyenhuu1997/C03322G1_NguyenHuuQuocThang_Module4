package com.example.demo.controller;

import com.example.demo.model.employee.*;
import com.example.demo.service.employee.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;

    @Autowired
    IDivisionService divisionService;

    @Autowired
    IPositionService positionService;

    @Autowired
    IEducationDegreeService educationDegreeService;

    @Autowired
    IUserService userService;

    @GetMapping
    public String showPage(@PageableDefault(value = 5) Pageable pageable, Model model) {
        Page<Employee> employeeList = employeeService.findAll(pageable);
        List<Division> divisionList = divisionService.findAll();
        List<Position> positionList = positionService.findAll();
        List<EducationDegree> educationDegreeList = educationDegreeService.findAll();
        List<User> userList = userService.findAll();

        model.addAttribute("employeeList", employeeList);
        model.addAttribute("divisionList", divisionList);
        model.addAttribute("positionList", positionList);
        model.addAttribute("educationDegreeList", educationDegreeList);
        model.addAttribute("userList", userList);

        return "employee/list";
    }

    @GetMapping("/search")
    public String search(@PageableDefault(value = 5) Pageable pageable, String keyword, Model model) {
        Page<Employee> employeeList = employeeService.search(keyword, pageable);
        List<Division> divisionList = divisionService.findAll();
        List<Position> positionList = positionService.findAll();
        List<EducationDegree> educationDegreeList = educationDegreeService.findAll();

        if (employeeList.isEmpty()) {
            model.addAttribute("message", "Không tìm thấy kết quả phù hợp!");
            return "employee/list";
        }

        model.addAttribute("employeeList", employeeList);
        model.addAttribute("divisionList", divisionList);
        model.addAttribute("positionList", positionList);
        model.addAttribute("educationDegreeList", educationDegreeList);

        return "employee/list";
    }

    @PostMapping("/create")
    public String create(@RequestParam("newName") String employeeName, @RequestParam("newBirthDay") String employeeBirthday, @RequestParam("newIdentity") String employeeIdCard, @RequestParam("newSalary") Double employeeSalary, @RequestParam("newPhone") String employeePhone, @RequestParam("newEmail") String employeeEmail, @RequestParam("newAddress") String employeeAddress, @RequestParam("newPosition") Position position, @RequestParam("newEducationDegree") EducationDegree educationDegree, @RequestParam("newDivision") Division division, RedirectAttributes redirectAttributes) {
        employeeService.save(new Employee(employeeName, employeeBirthday, employeeIdCard, employeeSalary, employeePhone, employeeEmail, employeeAddress, position, educationDegree, division, null));
        redirectAttributes.addFlashAttribute("message", "Thêm mới thành công!");
        return "redirect:/employee";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("birthDay") String birthDay, @RequestParam("idCard") String idCard, @RequestParam("salary") Double salary, @RequestParam("phone") String phone, @RequestParam("email") String email, @RequestParam("address") String address, @RequestParam("position") Position position, @RequestParam("educationDegree") EducationDegree educationDegree, @RequestParam("division") Division division, RedirectAttributes redirectAttributes) {
        Employee employee = employeeService.findById(id);
        employee.setEmployeeName(name);
        employee.setEmployeeBirthday(birthDay);
        employee.setEmployeeIdCard(idCard);
        employee.setEmployeeSalary(salary);
        employee.setEmployeePhone(phone);
        employee.setEmployeeEmail(email);
        employee.setEmployeeAddress(address);
        employee.setPosition(position);
        employee.setEducationDegree(educationDegree);
        employee.setDivision(division);
        employeeService.save(employee);
        redirectAttributes.addFlashAttribute("message", "Cập nhật thành công!");
        return "redirect:/employee";
    }

    @GetMapping("delete")
    public String delete(@RequestParam int id) {
        employeeService.remove(id);
        return "redirect:/employee";
    }
}
