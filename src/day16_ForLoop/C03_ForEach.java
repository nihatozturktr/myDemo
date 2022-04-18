package day16_ForLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_ForEach {


    public static void main(String[] args) {
        ArrayList<String> myArrGroup = new ArrayList<String>();
        int[] myArr= {10,20,30,40};

        myArrGroup.add("ali");
        myArrGroup.add("veli");
        myArrGroup.add("deli");

       //for (int i = 0; i <  myArrGroup.size(); i++) {

       //    System.out.println("name "+ myArrGroup.get(i));

       //}
        for (String s  :myArrGroup
             ) {
            System.out.println("name2 "+ s);
            
        }

    }




}
