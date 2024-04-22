package com.employeehierarchy.model;

public class Manager extends Employee {
   public Manager(){
       System.out.println("manager Initialized");
    }
    public int teamsize;

    public Manager(int id, String name, String email, int salary, int teamsize) {
        super(id, name, email, salary);
        this.teamsize = teamsize;
    }

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamsize=" + teamsize +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    //overriding the showemployee method in Employee class
    public void showEmployeeInfo(){
        System.out.println("Manager Info :");
       // super.showEmployeeInfo();
        System.out.println("The id is"+id);
        System.out.println("The employee name is"+name);
        System.out.println("The employee email is"+email);
        System.out.println("The employee salary is"+salary);
        System.out.println("Team size defined is"+teamsize
        );
    }
    public void scheduleMeeting(){
        System.out.println("Scheduling Meeting");
    }
}
