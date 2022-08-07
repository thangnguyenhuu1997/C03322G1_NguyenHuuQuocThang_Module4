package com.example.demo.repository.contract;

import com.example.demo.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IContractRepository extends JpaRepository<Contract, Integer> {
}
