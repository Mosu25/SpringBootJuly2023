package com.api.training.springdemo.employee;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(1, "mosu", "mosu@gmail.com", 2500),
                new Employee(2, "santhosh", "santhosh@gmail.com", 4000),
                new Employee(3, "subash", "subash@gmail.com", 4500),
                new Employee(4, "arasu", "arasu@gmail.com", 6800)
        );
    }
}
