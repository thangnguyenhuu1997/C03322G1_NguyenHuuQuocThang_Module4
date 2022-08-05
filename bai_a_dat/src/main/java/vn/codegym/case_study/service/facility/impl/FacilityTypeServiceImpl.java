package vn.codegym.case_study.service.facility.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.facility.FacilityType;
import vn.codegym.case_study.repository.facility.FacilityTypeRepository;
import vn.codegym.case_study.service.facility.FacilityTypeService;

import java.util.List;

@Service
public class FacilityTypeServiceImpl implements FacilityTypeService {
    @Autowired
    FacilityTypeRepository facilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }
}
