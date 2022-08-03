package com.example.demo.service.contract.impl;

import com.example.demo.model.contract.Contract;
import com.example.demo.repository.contract.IContractRepository;
import com.example.demo.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<Contract> findAllContract(Pageable pageable){
        return iContractRepository.findAllContract(pageable);
    }
}
