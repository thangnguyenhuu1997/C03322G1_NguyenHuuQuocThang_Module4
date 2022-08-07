package com.example.demo.service.facility;

import com.example.demo.model.facility.FacilityType;

import java.util.List;
import java.util.Optional;

public interface IFacilityTypeService {
    List<FacilityType> findAll();

    void save(FacilityType facilityType);

    Optional<FacilityType> findById(Integer id);
}
