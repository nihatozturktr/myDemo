package day21_Scope_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        /**
         * Now that we know how to set and get array elements, we can calculate the sum of all elements in an array by using loops.
         * The for loop is the most used loop when working with arrays, as we can use the length of the array to determine how many times to run the loop.
         *
         */
        // Let's get 5 numbers from the user then let's sum number of all
        int sum=0;
        int num;
        int beginArrIndex=5 ;
        int []myArr= new int[5];




        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter 5 arrays number");


        for (int i = 0; i < beginArrIndex; i++) {
            myArr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(myArr));

        for (int i = 0; i <myArr.length ; i++) {
            sum+=myArr[i];

        }
        System.out.println("total ="+ sum);


        }


    }

