package association;

public class Company {
    Trainer trainer;

    public Company(Trainer trainer) {
        this.trainer = trainer;
    }

    public static void main(String[] args) {
        Trainer t=new Trainer();
        Company com=new Company(t);
        System.out.println("Company:"+com.hashCode());
        System.out.println("Trainer:"+ t.hashCode());
        com=null;
        System.out.println("Trainer:"+ t.hashCode());
        System.out.println("Company:"+com.hashCode());

    }
}
