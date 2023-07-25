package com.api.training.springdemo.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    //List of employees available
    @GetMapping(path = "/employees")
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(1, "mosu", "mosu@gmail.com",2500),
                new Employee(2, "santhosh", "santhosh@gmail.com",4000),
                new Employee(3, "subash", "subash@gmail.com",4500),
                new Employee(4, "arasu", "arasu@gmail.com",6800)
        );
    }

}
