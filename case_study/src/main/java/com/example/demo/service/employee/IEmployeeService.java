package com.example.demo.service.employee;

import com.example.demo.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {

    Page<Employee> findAllEmployee(Pageable pageable);

    void save(Employee employee);

    void deleteById(Integer id);

    Page<Employee> searchByName(String keyword, Pageable pageable);
}