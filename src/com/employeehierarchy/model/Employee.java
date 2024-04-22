package com.employeehierarchy.model;

public abstract class Employee {
    protected int id;
    protected String name;
    protected String email;
    protected int salary;

    public Employee(int id, String name, String email, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
    public Employee(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 20){
            this.id=id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        //conditions can be set inside a setter method

        if(name!=null) {
            this.name = name;
        }

    }
    public void setName(String s,String k){
        this.name=k;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void showEmployeeInfo();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
