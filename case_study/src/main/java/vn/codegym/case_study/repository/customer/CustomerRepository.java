package vn.codegym.case_study.repository.customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.case_study.model.customer.Customer;

import javax.transaction.Transactional;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email, String address, Pageable pageable);
}
