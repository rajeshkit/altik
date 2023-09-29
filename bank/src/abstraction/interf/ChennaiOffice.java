package abstraction.interf;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChennaiOffice implements Passport{
    @Override
    public void verification() {
        System.out.println("Aadhar Proof");
    }

    @Override
    public void registration() {
        System.out.println("www.chennaipassportseva.com");
    }

    public static void main(String[] args) {
        Passport pass=null;
        pass=new ChennaiOffice();
        pass.registration();
        pass=new BangaloreOffice();
        pass.registration();
    }











}
