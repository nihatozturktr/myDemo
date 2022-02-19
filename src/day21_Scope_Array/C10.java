package day21_Scope_Array;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        /**
         *Reverse a String
         *
         *
         * Write a program to take a string as input and output its reverse.
         * The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.
         *
         * Sample Input:
         * hello there
         *
         * Sample Output:
         * ereht olleh
         *
         */


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
        int n=arr.length;
        String str="";
        for(int i=n-1 ; i>-1 ; i--){
            str=str+arr[i];
        }
        System.out.println(str);



    }
}
