package day12_StringManipulations;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        //Kullanicidan cumle ve kelime alin
        //Girilen kelime cumlede 1 defa geciyorsa  "1" yazdirin
        //Girilen kelime cumlede 2 defa geciyorsa  "2" yazdirin
        //Girilen kelime cumlede 3 defa geciyorsa  "3" yazdirin

Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String cumle = scan.nextLine();

        System.out.println("Lutfen bir kelime giriniz");
  String kelime = scan.nextLine();

int index= kelime.indexOf(0);
        System.out.println(kelime.length());










    }
}
