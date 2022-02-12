package com.company;

import java.util.Arrays;

public class myTry {

    public static void main(String[] args) {

        int myArr[]={10,2,30,41,15,6,7};


        System.out.println(Arrays.toString(myArr));



      Arrays.sort(myArr);


        // Araarydeki elemanlari topla


        int toplam=0;

        for (int i = 0; i < myArr.length-1; i++) {


            toplam+=myArr.length;


        }
        System.out.println(toplam);





    }
}
