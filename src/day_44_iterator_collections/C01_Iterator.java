package day_44_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(5);
        liste.add(3);
        liste.add(7);
        liste.add(1);
        liste.add(9);
        liste.add(8);
        liste.add(2);

        System.out.println(liste);

        // index kullanmadan elemanlari 3 eklenmis olarak yazdirin

        for (Integer each :liste             ) {
            System.out.println(each+3 +" ");

        }
        System.out.println(" ");
        System.out.println(liste);// [5, 3, 7, 1, 9, 8, 2] yazar

        // foreach loop ile index kullanmadan tum elementlere ulasabiliyoruz ama kalici degisiklik yapamiyoruz





    }





}
