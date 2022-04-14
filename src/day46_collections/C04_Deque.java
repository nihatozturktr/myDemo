package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {

        Deque <String> ciftBasli = new LinkedList<>();
        ciftBasli.add("Yildiz");
        ciftBasli.add("Ali");
        System.out.println(ciftBasli);
        ciftBasli.addLast("Emine");
        System.out.println(ciftBasli);

        System.out.println(ciftBasli.pop());







    }
}
