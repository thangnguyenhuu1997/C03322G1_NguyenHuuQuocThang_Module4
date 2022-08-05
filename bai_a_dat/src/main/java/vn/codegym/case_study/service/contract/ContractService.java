package vn.codegym.case_study.service.contract;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.case_study.model.contract.Contract;

import java.util.List;
import java.util.Optional;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    Optional<Contract> findById(Integer id);

    void save(Contract contract);

    List<Double> getTotalMoney();
}
