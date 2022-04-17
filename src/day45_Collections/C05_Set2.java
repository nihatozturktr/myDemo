package day45_Collections;

import java.util.HashSet;
import java.util.Set;

public class C05_Set2 {
    public static void main(String[] args) {
        Set<String> meyveler = new HashSet<String>();
        meyveler.add("Elma");
        meyveler.add("Kiraz");
        meyveler.add("Armut");

        for (String meyve: meyveler
             ) {
            System.out.println(meyve);

        }

    }
}
