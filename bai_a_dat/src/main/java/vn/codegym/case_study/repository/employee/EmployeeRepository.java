package vn.codegym.case_study.repository.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address, Pageable pageable);
}
