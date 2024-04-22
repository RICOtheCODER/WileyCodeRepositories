package com.employeehierarchy.model;

public class FrontEndDeveloper extends Developer {

    public FrontEndDeveloper(int id,String name,String email,int salary,String programminglanguage){
       this.id=id;
       this.name=name;
       this.email=email;
       this.salary=salary;
       this.programminglanguage=programminglanguage;

    }
    @Override
    public void showEmployeeInfo() {
        System.out.println("FrontEnd Developer info ");
        //super.showEmployeeInfo();//this womt work as there is no object in the abstract class employee
        System.out.println("The id is"+id);
        System.out.println("The employee name is"+name);
        System.out.println("The employee email is"+email);
        System.out.println("The employee salary is"+salary);
        System.out.println("Programming Language is used is"+programminglanguage);
    }
}
