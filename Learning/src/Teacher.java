public class Teacher {
    int teacherId; // instance varibale
    static float salary=67667; //static varibale
    String teacherName;
    void display(){  // instance method
        System.out.println(teacherId + " "+ teacherName);
    }
    static void show(){ // static method
        System.out.println("show method is called");
    }

    public static void main(String[] args) {
//        long phone; // primitive variable
//        Teacher teach; // reference variable or non primitive variable
//        String str;// reference variable or non primitive variable
            Teacher t1= new Teacher();//70707070
            t1.teacherId=100;
            t1.teacherName="ajay";
            Teacher t2 = new Teacher();//90909090
            t2.teacherId=200;
            t2.teacherName="harish";
            Teacher t3 = new Teacher();//101010
            t3.teacherId=300;
            t3.teacherName="amala";
            t1.display();
            t2.display();
            t3.display();
    }
}







