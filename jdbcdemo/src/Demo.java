enum Days{

    SUNDAY,MONDAY;
    Days(){
        System.out.println("constructor called");
    }
    void getData(){
        System.out.println("Welcome Enum");
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        //System.out.println(Days.SUNDAY);

    }
}
