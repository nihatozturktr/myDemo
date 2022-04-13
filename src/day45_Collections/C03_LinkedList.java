package day45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {

    public static void main(String[] args) {
        LinkedList <Integer> ll44 = new LinkedList<>();
        ll44.add(90);
        ll44.add(97);



        System.out.println(ll44.peek());// silmeden ilk elemani bize getirir
        System.out.println(ll44.peekFirst());// silmeden ilk elemani bize getirir

        LinkedList ll66 = new LinkedList<>();

        System.out.println(ll66.peekFirst());//
        System.out.println(ll66.peek());

        ll44.poll();
        ll44.poll();
        ll44.poll();
        System.out.println(ll44);

        ll44.add(46);



        System.out.println(ll44.offer(99));// hem listeye eleman ekledi hem de true dondurdu
        System.out.println(ll44);

        System.out.println(ll44.hashCode());// javanin verdigi hashCodu u doner





    }
}
