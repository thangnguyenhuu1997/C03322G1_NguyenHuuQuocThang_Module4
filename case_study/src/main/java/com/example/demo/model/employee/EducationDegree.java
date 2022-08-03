package com.example.demo.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_degree_id")
    private Integer eduDegreeId;

    @Column(name = "education_degree_name")
    private String eduDegreeName;

    @OneToMany(mappedBy = "educationDegree", cascade = CascadeType.ALL)
    private Set<Employee> employees;


    public Integer getEduDegreeId() {
        return eduDegreeId;
    }

    public void setEduDegreeId(Integer eduDegreeId) {
        this.eduDegreeId = eduDegreeId;
    }

    public String getEduDegreeName() {
        return eduDegreeName;
    }

    public void setEduDegreeName(String eduDegreeName) {
        this.eduDegreeName = eduDegreeName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
