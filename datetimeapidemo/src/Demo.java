public class Demo {
    public static void main(String[] args) {
        Days day=Days.SUNDAY;//public static final SUNDAY=new Days();
        System.out.println(day);
        Days.SUNDAY.display();
        Days.SATURDAY.display();
        if(day==Days.SUNDAY){

        }
    }
}
