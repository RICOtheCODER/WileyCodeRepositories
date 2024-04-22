package com.employeehierarchy.model;

public abstract class Developer extends Employee{
    protected String programminglanguage;

    public Developer(){

    }

    public Developer(int id, String name, String email, int salary,String programminglanguage) {
        super(id, name, email, salary);
        this.programminglanguage=programminglanguage;
    }
    public void debugCode(){
        System.out.println("Debugging Code");
    }

    public abstract void showEmployeeInfo();
}
