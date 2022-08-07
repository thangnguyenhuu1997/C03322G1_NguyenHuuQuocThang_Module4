package com.example.demo.model.facility;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "facility_type")
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "facility_type_id")
    private Integer facilityTypeId;

    @Column(name = "facility_type_name")
    private String facilityTypeName;

    @OneToMany(mappedBy = "facilityType", cascade = CascadeType.ALL)
    private Set<Facility> facility;

    public Integer getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(Integer facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getFacilityTypeName() {
        return facilityTypeName;
    }

    public void setFacilityTypeName(String facilityTypeName) {
        this.facilityTypeName = facilityTypeName;
    }

    public Set<Facility> getFacility() {
        return facility;
    }

    public void setFacility(Set<Facility> facility) {
        this.facility = facility;
    }
}