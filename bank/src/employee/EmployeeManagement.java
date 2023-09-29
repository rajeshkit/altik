package employee;
public class EmployeeManagement {
    public static void main(String[] args) {
        Object c;
        Hr hr=new Hr();

       PermanentEmployee p1=new PermanentEmployee();
       hr.display(p1);
       TemporaryEmployee p2=new TemporaryEmployee();
       hr.display(p2);
       SupportEmployee p3=new SupportEmployee();
       hr.display(p3);
    }
}
