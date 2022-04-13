package day45_Collections;

import javax.swing.tree.TreeModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    //Collection nesnelerden olusan bir toplulugu bir arada tutan yapidir

    //1 Set (KUme)
    //2 Queue(Sira)
    //3Linked (Bagli)
    //4 Tree (Dogal Sirali)
    // Has

    public static void main(String[] args) {
        List<Integer> ll0 = new ArrayList<>();
        ll0.add(0);
        ll0.add(2);

        LinkedList <Integer> ll1 = new LinkedList<>();
        ll1.add(90);
        ll1.add(97);



        LinkedList <Integer> ll = new LinkedList<>();// Java bir datayi tutacak kadar bir obje olusturur

        ll.add(15);
        ll.add(12);
        ll.add(14);
        ll.add(19);

        System.out.println(ll.hashCode());

        ll.add(2,34);
        ll.addAll(ll1);



        ll.add(17);
        ll.addFirst(55);
        System.out.println(ll.hashCode());
        System.out.println(ll+" ");

        /*  1 ik eleman her zaman head'dir ve headde data yokru, sadece adress vardir/
        2- Son eleman( tail)  nill'i point eder
        3-Her elemanin icinde data ve adress kismi olmak uzere iki kisim avrdir
        4- Tum elemanlar pointer"lar/ adress'ler kullanilarak birbirine baglanir
        5- Her eleman node olarak adalaridir




         */


    }
}
