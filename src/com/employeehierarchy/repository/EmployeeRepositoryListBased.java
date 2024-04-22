package com.employeehierarchy.repository;

import com.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryListBased implements EmployeeRepository{
    List<Employee> employeeList;

    public EmployeeRepositoryListBased() {
       employeeList=new ArrayList<>();
       //initialized lik this whatever values will be passed to constructor that willbe passed to the list
    }

    @Override
    public void saveEmployee(Employee employee) {
            employeeList.add(employee);
    }

    @Override
    public Employee findEmployeebyID(int id) {
//        for(int i=0;i<employeeList.size();i++){
//            int n=employeeList.get(i).getId();
//            if(id==n){
//                return employeeList.get(i);
//            }
//        } //this also works
        for(Employee emp49 :employeeList){
            if(emp49.getId()==id){
                return emp49;
            }
        }
        return null;

    }

    @Override
    public void deleteEmployeebyID(int id) {
        Employee e=findEmployeebyID(id);
        employeeList.remove(e);
    }
    public List<Employee> getAllEmployees(){
        return employeeList;
    }
}
