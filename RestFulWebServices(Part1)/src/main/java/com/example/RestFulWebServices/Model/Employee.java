package com.example.RestFulWebServices.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Employee {

    private long id;
    @NotBlank(message = "kuch daal to bhai")
    private String name;
    @Min(value = 18,message = "Age less than 18")
    private int age;
}
