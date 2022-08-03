package com.example.demo.repository.employee;

import com.example.demo.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "select * from employee where status_delete = 0", nativeQuery = true)
    Page<Employee> findAllEmployee(Pageable pageable);

    @Modifying
    @Query(value = "update employee set status_delete = 1 where employee_id = :id", nativeQuery = true)
    void deleteById(@Param("id") Integer id);

    @Query(value = "select * from employee where employee_name like :name", nativeQuery = true)
    Page<Employee> searchByName(@Param("name") String keyword, Pageable pageable);
}
