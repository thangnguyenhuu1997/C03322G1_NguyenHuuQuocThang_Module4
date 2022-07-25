package com.example.demo.repository.customer;

import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import org.springframework.data.domain.Pageable;

@Transactional
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select * from customer where status_delete = 0", nativeQuery = true,
            countQuery="select count(*) from customer where status_delete = 0")
    Page<Customer> findAllCustomer(Pageable pageable);

    @Modifying
    @Query(value = "insert into customer (customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, status_delete) " +
            "       values (:type, :name, :birth, :gender, :idCard, :phone, :email, :address, 0 )", nativeQuery = true)
    void save(@Param("type") Integer type, @Param("name") String name, @Param("birth") String birth, @Param("gender") Integer gender, @Param("idCard") String idCard, @Param("phone") String phone, @Param("email") String email, @Param("address") String address);

    @Query(value = "select * from customer where customer_id = :id", nativeQuery = true)
    Customer findByIdCustomer(@Param("id") Integer id);

    @Modifying
    @Query(value = "update customer set customer_type_id = :type, customer_name = :name, customer_birthday = :birth, customer_gender = :gender, customer_id_card = :idCard, customer_phone = :phone, customer_email = :email, customer_address = :address  where customer_id = :id", nativeQuery = true)
    void update(@Param("type") Integer type, @Param("name") String name, @Param("birth") String birth, @Param("gender") Integer gender, @Param("idCard") String idCard, @Param("phone") String phone, @Param("email") String email, @Param("address") String address, @Param("id") Integer id);

    @Modifying
    @Query(value = "update customer set status_delete = 0 where customer_id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);

    @Query(value = "select * from customer where customer_name = :name", nativeQuery = true,
            countQuery="select count(*) from product where customer_name = :name")
    Page<Customer> findAllCustomerByName(Pageable pageable, @Param("name") String name);
}