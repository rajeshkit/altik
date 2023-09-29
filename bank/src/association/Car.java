package association;

public class Car {
    Engine engine;
    Car(){
        engine=new Engine();
    }
    void drive(){
        System.out.println("Driving a car");

    }

    public static void main(String[] args) {
            Car car=new Car();
            car.drive();
           // car=null;
            car.engine.run();
    }
}







