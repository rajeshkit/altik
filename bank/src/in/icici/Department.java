package in.icici;

public class Department {
    private Student student;

    public Department(Student student) {
        this.student = student;
    }
    void display(){
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        //Student s1=new Student();
        Department department=new Department(null);
        department.display();

    }
}
