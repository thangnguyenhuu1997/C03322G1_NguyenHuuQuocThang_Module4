package com.example.demo.model.customer;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @Column(name = "customer_type_id")
    private int customerTypeId;

    @Column(name = "customer_type_name")
    private String customerTypeName;

    @OneToMany(mappedBy = "customerType", cascade = CascadeType.ALL)
    private Set<Customer> customer;

    public CustomerType() {
    }

    public CustomerType(int customerTypeId, String customerTypeName, Set<Customer> customer) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
        this.customer = customer;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }
}

