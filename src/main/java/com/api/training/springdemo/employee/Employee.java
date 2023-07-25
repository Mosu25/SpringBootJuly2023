package com.api.training.springdemo.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity //Table
public class Employee {

    @Id
    private int id;
    private String name;
    private String email;
    private int salary;

}
