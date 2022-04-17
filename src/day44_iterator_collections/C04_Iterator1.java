package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class C04_Iterator1 {

    public static void main(String[] args) {
        List <String> list3 = new ArrayList<String>();

        list3.add("Ankara");
        list3.add("Corum");
        list3.add("Istanbul");
        list3.add("Van");
        list3.add("Kastamonu");

        System.out.println(list3);

        Iterator it1 = list3.iterator();

        it1.next();
        it1.hasNext();


        it1.remove();// son uzerinden gectigimiz elemani siler


        LinkedList <Integer> list4= new LinkedList<>();






    }
}
