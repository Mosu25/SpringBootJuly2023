package com.api.training.springdemo.employee;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Employee {

    private int id;
    private String name;
    private String email;
    private int salary;

}
