package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    public void saveEmployee(Employee employee);
    //data is inserted of employ type when we create object of employee class
    //like employee employe=new employee(123,"employee name",......);
    public Employee findEmployeebyID(int id);

    public void deleteEmployeebyID(int id);

    List<Employee> getAllEmployees();
}

