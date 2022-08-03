package com.example.demo.model.facility;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "rent_type")
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "rent_type_id")
    private Integer rentTypeId;

    @Column (name = "rent_type_name")
    private String rentTypeName;

    @OneToMany(mappedBy = "rentType", cascade = CascadeType.ALL)
    private Set<Facility> facility;

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public Set<Facility> getFacility() {
        return facility;
    }

    public void setFacility(Set<Facility> facility) {
        this.facility = facility;
    }
}
