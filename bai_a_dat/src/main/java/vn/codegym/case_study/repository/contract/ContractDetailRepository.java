package vn.codegym.case_study.repository.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.contract.ContractDetail;

public interface ContractDetailRepository extends JpaRepository<ContractDetail, Integer> {
}
