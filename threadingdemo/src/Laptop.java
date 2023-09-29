public class Laptop extends Thread{
    @Override
    public void run() {

            for (int i = 0; i < 5; i++) {
               synchronized (this) {
                   System.out.println(Thread.currentThread().getName() + ":" + i);
               }
            }


    }

    public static void main(String[] args) {
        Laptop l=new Laptop();
        Laptop l1=new Laptop();
        l.start(); // run
        l1.start();// run



    }
}
