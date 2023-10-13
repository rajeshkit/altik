package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main{
    public static void main(String[] args) {
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("beans.xml");
//               Department d= ac.getBean(Department.class);
//               d.display();
                    Staff s=ac.getBean("staff1",Staff.class);
                   s.displayStaff();
//                Employee e1 = ac.getBean("emp1",Employee.class);
//                System.out.println(e1.hashCode());
//                Employee e2 = ac.getBean("emp1",Employee.class);
//                System.out.println(e2.hashCode());
//                Employee e3= ac.getBean("emp1",Employee.class);
//                System.out.println(e3.hashCode());
//                Staff s=ac.getBean(Staff.class);
//                s.displayStaff();
//                System.out.println(s.getStaffId());
//                System.out.println(s.getStaffName());

        //            Employee e=ac.getBean("emp2",Employee.class);
//            e.displayEmployee();
//            System.out.println(e.employeeId);
//            System.out.println(e.employeeName);
//        Employee e1=ac.getBean("emp1",Employee.class);
//        e1.displayEmployee();
//        System.out.println(e1.employeeId);
//        System.out.println(e1.employeeName);
            ((AbstractApplicationContext)ac).close();




    }
}