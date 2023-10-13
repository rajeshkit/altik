package di;

public class Main {
    public static void main(String[] args) {
        Passenger p=new Passenger(new BusTravels());
        p.travel();

    }
}
