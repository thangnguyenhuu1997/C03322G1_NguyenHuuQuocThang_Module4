package vn.codegym.case_study.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.customer.CustomerType;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
}
