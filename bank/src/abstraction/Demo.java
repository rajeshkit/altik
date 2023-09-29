package abstraction;

public class Demo {
    public static void main(String[] args) {
        int a=45;
        Integer i =a;//Auto - boxing
        int v = i; // Auto - Unboxing

        int value = i.intValue();
        float rating=5.7f;

        Float f=Float.valueOf(rating);//boxing
       float val=  f.floatValue(); // unboxing
    }
}
