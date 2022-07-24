package com.example.demo.dto;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDTO {
    private int id;
    @Size(min = 5, max = 45, message = "First name has more than 5 characters and less than 45 characters")
    private String firstName;

    @Size(min = 5, max = 45, message = "Last name has more than 5 characters and less than 45 characters")
    private String lastName;

    @Pattern(regexp = "^(09|07|03)\\d{8}$", message = "Wrong format, For ex: (09|03|07)-XXXXXXXX")
    private String phone;

    @Min(value = 18, message = "Age must be more than 0")
    private int age;


    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong format, For ex: abc@gmail.com")
    private String email;
}
