package day17_Methoden;

import java.util.Scanner;

public class C02_FaktoriyelMethode {
     public static void faktoriyel(){
         System.out.println("Lutfen numara girin");
         Scanner scan = new Scanner(System.in);
         int sayi = scan.nextInt();
         int faktoriyel = 1;

         while (sayi>0){
             faktoriyel *=sayi;
             sayi--;

         }
         System.out.println(faktoriyel);
     }




    public static void main(String[] args) {


         faktoriyel();
        faktoriyel();

    }
}
