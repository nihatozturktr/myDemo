package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        // FIFO first in first out

        Queue <String> kuyruk = new LinkedList<>();

        kuyruk.add("Lutfullah");
        kuyruk.add("Mustafa");
        kuyruk.add("Rifvan");

        System.out.println(kuyruk);

       kuyruk.remove();

        System.out.println(kuyruk);




    }
}
