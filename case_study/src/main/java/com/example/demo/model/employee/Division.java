package com.example.demo.model.employee;


import javax.persistence.*;
import java.util.Set;

@Entity(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "division_id")
    private Integer divisionId;

    @Column (name = "division_name")
    private String divisionName;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployee(Set<Employee> employees) {
        this.employees = employees;
    }
}
