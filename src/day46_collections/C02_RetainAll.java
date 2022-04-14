package day46_collections;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {

    public static void main(String[] args) {

        Set<String> Ihs1= new LinkedHashSet<>();

        Ihs1.add("Ali");
        Ihs1.add("Mehmet Ali");
        Ihs1.add("Hasan");
        Ihs1.add("Kutlu");

        Set <String> Ihs2 = new LinkedHashSet<>();

        Ihs2.add("Ali");
        Ihs2.add("Mehmet Ali");
        Ihs2.add("Filiz");

        //System.out.println(Ihs1.retainAll(Ihs2));// true
        //System.out.println(Ihs1);
        //System.out.println(Ihs2);

        System.out.println(Ihs2.retainAll(Ihs1));
        System.out.println(Ihs2);// Ortak elemanlari aldi


    }
}
