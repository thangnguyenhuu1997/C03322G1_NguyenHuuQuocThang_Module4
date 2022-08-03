package com.example.demo.service.contract.impl;

import com.example.demo.model.contract.AttachFacility;
import com.example.demo.repository.contract.IAttachFacilityRepository;
import com.example.demo.service.contract.IAttachFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacilityService {

    @Autowired
    private IAttachFacilityRepository iAttachFacilityRepository;

    @Override
    public List<AttachFacility> findAll(){
        return iAttachFacilityRepository.findAll();
    }
}
