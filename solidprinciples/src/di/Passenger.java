package di;

public class Passenger {
    private Travel t;

    public Passenger(Travel t) {
        this.t = t;
    }

    public void travel(){
        System.out.println(t.issueTicket());
        //ticket
    }
}
