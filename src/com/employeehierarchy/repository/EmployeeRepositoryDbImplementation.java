package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.List;

public class EmployeeRepositoryDbImplementation implements EmployeeRepository,CommonRepository{
    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Employee findEmployeebyID(int id) {
        return null;
    }

    @Override
    public void deleteEmployeebyID(int id) {

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public void showCommonInfo() {
        
    }
}
