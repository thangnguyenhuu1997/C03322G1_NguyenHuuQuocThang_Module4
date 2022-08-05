package vn.codegym.case_study.service.contract;

import vn.codegym.case_study.model.contract.ContractDetail;

import java.util.List;

public interface ContractDetailService {
    List<ContractDetail> findAll();

    void save(ContractDetail contractDetail);
}
