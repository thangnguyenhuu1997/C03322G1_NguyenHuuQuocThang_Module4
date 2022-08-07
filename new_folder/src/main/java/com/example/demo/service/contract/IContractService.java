package com.example.demo.service.contract;

import com.example.demo.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);

    Optional<Contract> findById(Integer id);

    void save(Contract contract);

    List<Double> getTotalMoney();
}
