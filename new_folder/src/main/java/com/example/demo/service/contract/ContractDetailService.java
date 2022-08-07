package com.example.demo.service.contract;

import com.example.demo.model.contract.ContractDetail;
import com.example.demo.repository.contract.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractDetailService implements IContractDetailService {
    @Autowired
    IContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }
}
