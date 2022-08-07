package com.example.demo.service.contract;

import com.example.demo.model.contract.AttachFacility;
import com.example.demo.repository.contract.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AttachFacilityService implements IAttachFacilityService {
    @Autowired
    IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }
}
