public class Computer{
    public static void main(String[] args) {
        Runnable r=new IPad();
        Thread t2=new Thread(r);
        t2.start();
        r=new Desktop();
        Thread t1=new Thread(r);
        t1.start();
    }
}
