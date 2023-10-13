package org.example;

public class Staff {
    private int staffId;
    private String staffName;
    private Employee employee;

    public Staff(Employee employee) { // <bean id="staff1" class="org.example.Staff" autowire="constructor">
        this.employee = employee;
    }

    void displayStaff(){
        employee.displayEmployee();
    }
}
