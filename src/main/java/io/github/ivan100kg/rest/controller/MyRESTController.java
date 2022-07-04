package io.github.ivan100kg.rest.controller;

import io.github.ivan100kg.rest.entity.Employee;
import io.github.ivan100kg.rest.exception_handling.EmployeeWrongId;
import io.github.ivan100kg.rest.exception_handling.NoSuchEmployeeException;
import io.github.ivan100kg.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployee() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("There is no such Employee with ID: " + id);
        }
        return employee;
    }
}
