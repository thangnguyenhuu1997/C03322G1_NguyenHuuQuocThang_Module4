package vn.codegym.case_study.service.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.employee.Employee;
import vn.codegym.case_study.repository.employee.EmployeeRepository;
import vn.codegym.case_study.service.employee.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> search(String keyword, Pageable pageable) {
        return employeeRepository.findAllByNameContainsOrEmailContainsOrAddressContains(keyword, keyword, keyword, pageable);
    }
}
