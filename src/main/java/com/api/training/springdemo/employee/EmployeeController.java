package com.api.training.springdemo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(path = "/employees1")
    public List<Employee> getEmployeeMatchingQuery(@RequestParam(required = false) int limit) {
        return employeeService.getEmployeeMatchingQuery(limit);
    }

    @GetMapping(path = "/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping(path = "/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping(path = "employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
    @PutMapping(path = "employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id){
        return employeeService.updateEmployee(employee, id);
    }

}
