package stringdemo;

public class Demo {
    public static void main(String[] args) {
        String name="Altimetrik"; // String literal Immutable

        String company="Altimetrik";
        System.out.println(company.hashCode());
        name=name+" "+"Chennai";
       String str=new String("Altimetrik");// String class obj
//        // String literal Immutable
        System.out.println(name.hashCode());
        System.out.println(str.hashCode());
//
        StringBuffer sb=new StringBuffer("Altimetrik");// Muttable
        StringBuilder sbb=new StringBuilder("Altimetrik");// Muttable




    }

}
