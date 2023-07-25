package com.api.training.springdemo.employee;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired  //dependency injections
    private EmployeeService employeeService;

    //List of employees available
    @GetMapping(path = "/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees(); //one class depends on another
    }

    // Get single employee in the list of employees
    @GetMapping(path = "/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployees().get(id - 1);
    }
}
