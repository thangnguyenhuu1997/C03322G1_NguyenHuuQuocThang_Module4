package com.example.demo.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "attach_facility")
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attach_facility_id")
    private Integer id;

    @Column(name = "attach_facility_name")
    private String name;

    @Column(name = "attach_facility_cost")
    private Double cost;

    @Column(name = "attach_facility_unit")
    private String unit;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "attachFacility")
    @JsonBackReference
    private Set<ContractDetail> contractDetail;

    public AttachFacility() {
    }

    public AttachFacility(Integer id, String name, Double cost, String unit, String status, Set<ContractDetail> contractDetail) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.status = status;
        this.contractDetail = contractDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<ContractDetail> getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(Set<ContractDetail> contractDetail) {
        this.contractDetail = contractDetail;
    }
}
