package com.example.demo.service.facility;

import com.example.demo.model.facility.Facility;
import com.example.demo.repository.facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FacilityService implements IFacilityService{
    @Autowired
    private IFacilityRepository facilityRepository;


    @Override
    public Page<Facility> findAll(Pageable pageble) {
        return facilityRepository.findAll(pageble);
    }

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }

    @Override
    public void save(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public Optional<Facility> findById(Integer id) {
        return facilityRepository.findById(id);
    }

    @Override
    public void update(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public void remove(Integer id) {
        facilityRepository.deleteById(id);
    }
}
