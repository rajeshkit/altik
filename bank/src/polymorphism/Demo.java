package polymorphism;

import java.util.Scanner;

public class Demo extends Object {

    @Override
    public String toString() {
        return "Hai Rajesh Welcome to chennai:";
    }

    public static void main(String[] args) {
        Object obj=new Object();
        System.out.println(obj.toString());
    }
}
