package com.example.demo.service.contract.impl;

import com.example.demo.model.contract.ContractDetail;
import com.example.demo.repository.contract.IContractDetailRepository;
import com.example.demo.service.contract.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {

    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Override
    public List<ContractDetail> findAll(){
        return iContractDetailRepository.findAll();
    }
}
