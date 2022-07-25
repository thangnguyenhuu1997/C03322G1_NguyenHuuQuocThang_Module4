package com.codegym.product.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProductDto {
    private int id;

    @NotBlank
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid")
    private String name;

    @Min(value = 1, message = "Price must be more than 0")
    private Integer price;

    @NotBlank
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid")
    private String country;
    private int statusDelete;

    public ProductDto() {
    }

    public ProductDto(int id, @NotBlank @Size(max = 800) @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid") String name, @Min(value = 1, message = "Price must be more than 0") Integer price, @NotBlank @Size(max = 800) @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid") String country, int statusDelete) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.country = country;
        this.statusDelete = statusDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(int statusDelete) {
        this.statusDelete = statusDelete;
    }
}
