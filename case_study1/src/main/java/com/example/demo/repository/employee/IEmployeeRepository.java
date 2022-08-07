package com.example.demo.repository.employee;

import com.example.demo.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findByEmployeeNameContaining(String employeeName, Pageable page);
}


