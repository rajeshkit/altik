public class Trainee {
        int traineeId; // instance variable
        String name;
        int phone;
        String email;
        public Trainee(){
            System.out.println("trainee constructor is called");
        }

    public Trainee(int traineeId) {
        this.traineeId = traineeId;
    }

    public Trainee(int traineeId, String name) {
        this.traineeId = traineeId;
        this.name = name;
    }

    public Trainee(int traineeId, String name, int phone) {
        this.traineeId = traineeId;
        this.name = name;
        this.phone = phone;
    }

    public Trainee(int traineeId, String name, int phone, String email) {
        this.traineeId = traineeId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        }


       void display(){
           System.out.println(traineeId+" "+name+" "+phone+" "+email);
       }

        public static void main(String[] args) {
            Trainee t1=new Trainee(100,"abc",4545,"abc@gmail.com");
            t1.display();
            Trainee t2=new Trainee(200,"ebc",6545,"ebc@gmail.com");
            t2.display();
            Trainee t3=new Trainee(234);
            t3.display();

        }

}
