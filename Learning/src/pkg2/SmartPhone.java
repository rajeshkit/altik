package pkg2;

public class SmartPhone extends BasicPhone {
    SmartPhone(){
        super();
        System.out.println("smart phone no arg constructor");
    }
    SmartPhone(String name){
        this("rtfdf",6);
        System.out.println("smart phone one arg constructor");
    }
    SmartPhone(String name,int k){
        super(4.5f);
        System.out.println("smart phone two arg constructor");
    }
    public void whatsApp(){

    }
    public void camera(){

    }

    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone("fdf",567);



    }
}
