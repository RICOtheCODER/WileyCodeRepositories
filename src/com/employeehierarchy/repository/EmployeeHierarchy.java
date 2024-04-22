package com.employeehierarchy.repository;

import com.employeehierarchy.model.*;

public class EmployeeHierarchy {
    public static void main(String[] args) {

        //real usage of run time polymorphism
//
//        Employee emp1=new FrontEndDeveloper(25,"Remo","sbc@yahoo.in",8766,"Java");
//        emp1.showEmployeeInfo();
//      //  emp1.setId(5); //cannot be set and will return in original constructor value as condition not met in setID function
//       // emp1.setName("Rico","Mans");
//       // System.out.println(emp1.getId());
//       // System.out.println(emp1.getName());
//        Manager m ;
//        m=new Manager();
//        m.setId(106);
//        m.setName("Saurajit");
//        m.setEmail("gits@gmail.com");
//        m.setSalary(4500);
//        m.setTeamsize(456);
//       // m.showEmployeeInfo();
//
//        //run time polymorphism uses
//        //IS A relationship is shown here
//        Employee e;
//        e=new Manager();
//        e.showEmployeeInfo();
//
//        Employee f;
//        f=new BackendDeveloper("MYSQL");
//
//        Employee xyz;
//        xyz=new Manager();
//
//        Employee abc;
//        abc=new BackendDeveloper(123,"Starfield","exm@gmail.com",45877,"java","Sql");
//        ((Developer)abc).debugCode();
//        //here the abc is typecasted todeveloper class as employee does not have the debugcode in it
//       // ((Manager) abc).scheduleMeeting(); // not possible as Manager is not an instance of Backenddeveloper
//        if(abc instanceof Developer d){
//            d.debugCode(); //java solution to print correct class casting
//            //pattern matching oops
      //  }
        Employee employee1=new BackendDeveloper(25,"Saurajit Sarkar","abcunited@gmail.com",47600,"Java And Spring","My SQL");
        Employee employee2=new Manager(45,"Selena Gomez","selenaworks@gmail.com",89000,15);
        EmployeeRepository em1=new EmployeeRepositoryListBased();
        em1.saveEmployee(employee1);
        em1.saveEmployee(employee2);
        System.out.println(em1.findEmployeebyID(45));
        System.out.println(em1.getAllEmployees());
        System.out.println(em1.findEmployeebyID(25));
    }
}
