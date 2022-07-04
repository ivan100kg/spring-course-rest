package io.github.ivan100kg.rest.service;

import io.github.ivan100kg.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
