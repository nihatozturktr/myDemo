package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

    public static void main(String[] args) {


        List<Integer> ll44 = new LinkedList<>();
        ll44.add(90);
        ll44.add(97);


        ll44.add(11);// data turunu List sectigimiz  icin sadece List Interface'indeki metotlari kullanabiliriz
        //LinkedList class"inda override ettigimiz icin  Lisr interface olmasina ragmen  List method'larini kullanabildik

        Queue<Integer> ll55 = new LinkedList<>();

        ll55.add(5);
        ll55.clear();// Data turu Queue seilince Queur interfac'inden gelen methodlari kullanabildik

        Deque<Integer> ll66 = new LinkedList<>();

        ll66.add(55);
        ll66.add(57);
        ll66.addLast(23);





    }
}
