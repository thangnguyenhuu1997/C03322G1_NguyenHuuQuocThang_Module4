package com.example.demo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerTypeDto {
    private int customerTypeId;

    @NotBlank
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid")
    private String customerTypeName;

    public CustomerTypeDto() {
    }

    public CustomerTypeDto(int customerTypeId, @NotBlank @Size(max = 800) @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid") String customerTypeName) {
        this.customerTypeId = customerTypeId;
        this.customerTypeName = customerTypeName;
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
}
