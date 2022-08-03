package com.example.demo.service.facility;

import com.example.demo.model.facility.FacilityType;
import com.example.demo.repository.facility.IFacilityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    IFacilityTypeRepository facilityTypeRepository;
    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }

    @Override
    public void save(FacilityType facilityType) {
        facilityTypeRepository.save(facilityType);
    }

    @Override
    public Optional<FacilityType> findById(Integer id) {
        return facilityTypeRepository.findById(id);
    }
}
