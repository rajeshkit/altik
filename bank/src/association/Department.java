package association;

public class Department {
    private Student student;

    public Department(Student student) {
        this.student = student;
    }
    void display(){
        System.out.println("Display method called");

    }

    public static void main(String[] args) {
        Student stu=new Student();
        Department dept=new Department(stu);
        dept.display();
        dept=null;
        stu.show();

    }
}
