package com.example.demo.model.facility;

import javax.persistence.*;

@Entity(name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "facility_id")
    private Integer facilityId;

    @Column (name = "facility_name")
    private String facilityName;

    @Column (name = "facility_area")
    private Integer facilityArea;

    @Column (name = "facility_cost")
    private Double facilityCost;

    @Column (name = "facility_max_people")
    private Integer facilityMaxPeople;

    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "rent_type_id")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "facility_type_id", referencedColumnName = "facility_type_id")
    private FacilityType facilityType;

    @Column (name = "facility_standard_room")
    private String facilityStandardRoom;

    @Column (name = "description_other_convenience")
    private String descriptionOtherConvenience;

    @Column (name = "facility_pool_area")
    private Double facilityPoolArea;

    @Column (name = "facility_number_of_floors")
    private Integer facilityNumberOfFloors;

    @Column (name = "facility_free")
    private String facilityFree;

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public Integer getFacilityArea() {
        return facilityArea;
    }

    public void setFacilityArea(Integer facilityArea) {
        this.facilityArea = facilityArea;
    }

    public Double getFacilityCost() {
        return facilityCost;
    }

    public void setFacilityCost(Double facilityCost) {
        this.facilityCost = facilityCost;
    }

    public Integer getFacilityMaxPeople() {
        return facilityMaxPeople;
    }

    public void setFacilityMaxPeople(Integer facilityMaxPeople) {
        this.facilityMaxPeople = facilityMaxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public String getFacilityStandardRoom() {
        return facilityStandardRoom;
    }

    public void setFacilityStandardRoom(String facilityStandardRoom) {
        this.facilityStandardRoom = facilityStandardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public Double getFacilityPoolArea() {
        return facilityPoolArea;
    }

    public void setFacilityPoolArea(Double facilityPoolArea) {
        this.facilityPoolArea = facilityPoolArea;
    }

    public Integer getFacilityNumberOfFloors() {
        return facilityNumberOfFloors;
    }

    public void setFacilityNumberOfFloors(Integer facilityNumberOfFloors) {
        this.facilityNumberOfFloors = facilityNumberOfFloors;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
