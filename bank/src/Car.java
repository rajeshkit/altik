public class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }
    public void display(){
        System.out.println("Engine is working");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.display();
        System.out.println(car.engine);
        car=null;
        System.out.println(car.engine);
    }
}
