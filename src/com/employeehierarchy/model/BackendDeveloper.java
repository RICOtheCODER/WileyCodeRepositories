package com.employeehierarchy.model;

public class BackendDeveloper extends Developer{

    //super class must also contain default constructor
    private String database;
    public BackendDeveloper(String database){
        this.database=database;
    }


    public BackendDeveloper(int id, String name, String email, int salary, String programminglanguage,String database) {
        super(id, name, email, salary, programminglanguage);
        this.database=database;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("BACKEND Developer info ");
        //super.showEmployeeInfo();//this womt work as there is no object in the abstract class employee
        System.out.println("The id is"+id);
        System.out.println("The employee name is"+name);
        System.out.println("The employee email is"+email);
        System.out.println("The employee salary is"+salary);
        System.out.println("Programming Language is used is"+programminglanguage);
        System.out.println("DatabASe is"+database);
    }

    @Override
    public String toString() {
        return "BackendDeveloper{" +
                "database='" + database + '\'' +
                ", programminglanguage='" + programminglanguage + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
