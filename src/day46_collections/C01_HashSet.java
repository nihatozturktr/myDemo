package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

    public static void main(String[] args) {
        int arr[]= {3,4,6,4,2,4,6,8,6,5,3,1,2,4,5,7};

        Set<Integer> uniqeSet = new HashSet<>();

        for (Integer each:arr             ) {

            uniqeSet.add(each);

        }
        System.out.println(uniqeSet);

        Object[] tekrarsizArr = uniqeSet.toArray();
        System.out.println(Arrays.toString(tekrarsizArr));
    }



}
