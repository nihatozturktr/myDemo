package day21_Scope_Array;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        //Array in elemanlarini ayzdirmak istersek loop ile yazdirabiliriz.
        int arr[]={1,2,3,4,5,6,78,89};

        //Tum elementleri yazdirma

        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        } // Ya da Array Class'indan yardim alip direk aray olarak yazdirabiliriz.
        System.out.println(Arrays.toString(arr));

    }


}
