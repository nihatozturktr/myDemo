package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Set {

    public static void main(String[] args) {

        Set<Object> s1 = new HashSet<>();
        s1.add(4);
        s1.add(7);
        s1.add(11);
        s1.add(4);
        s1.add("java is good");
        System.out.println(s1);



        List<Object> list = new ArrayList<>();

        list.add("Java");
        list.add(1);
        list.add(true);
        list.add(s1);

        System.out.println(list);


    }
}
