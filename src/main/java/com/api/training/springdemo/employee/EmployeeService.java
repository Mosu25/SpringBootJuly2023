package com.api.training.springdemo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        List<Employee> employees = List.of(
                new Employee(1, "mosu", "mosu@gmail.com", 2500),
                new Employee(2, "santhosh", "santhosh@gmail.com", 4000),
                new Employee(3, "subash", "subash@gmail.com", 4500),
                new Employee(4, "arasu", "arasu@gmail.com", 6800)
        );
        employeeRepository.saveAll(employees);
        return employeeRepository.findAll();
    }

    public Employee getEmployee(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        if (!byId.isPresent()) {
            throw new IllegalStateException("Employee id not present");
        }
        return employeeRepository.getById(id);
    }

    public Employee addEmployee(Employee employee) {

        if (employeeRepository.existsById(employee.getId())) {
            throw new IllegalStateException("Employee id already exit");
        }
        employeeRepository.save(employee);
        return employee;
    }

    public String deleteEmployee(int id) {

        if (!employeeRepository.existsById(id)) {
            throw new IllegalStateException("Employee id not present");
        }
        employeeRepository.deleteById(id);

        return "Employee id deleted successfully";
    }

    public Employee updateEmployee(Employee employee, int id) {
        if (!employeeRepository.existsById(id)) {
            throw new IllegalStateException("Employee id not present");
        }
        employeeRepository.deleteById(id);
        employeeRepository.save(employee);
        return employee;
    }

    public List<Employee> getEmployeeMatchingQuery(int limit) {
        return employeeRepository.findAll().stream().limit(limit).collect(Collectors.toList());
    }
}
