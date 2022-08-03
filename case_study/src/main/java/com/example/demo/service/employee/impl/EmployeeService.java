package com.example.demo.service.employee.impl;

import com.example.demo.model.employee.Employee;
import com.example.demo.repository.employee.IEmployeeRepository;
import com.example.demo.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return iEmployeeRepository.findAllEmployee(pageable);
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public void deleteById(Integer id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> searchByName(String keyword, Pageable pageable) {
        return iEmployeeRepository.searchByName("%" + keyword + "%", pageable);
    }
}
