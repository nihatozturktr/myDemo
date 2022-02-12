package com.company;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Plase enetr a 4 digit number");

        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {

            System.out.println("You mast a 4 digit number");
        } else { // 4 basamakli sayilari bulacak
            if (sayi % 5 == 0) {

                if (sayi % 10 == 0) {
                    System.out.println("5 e bolunebilen cift sayi");
                } else {
                    System.out.println("5 e bolunebilen tek sayi");
                }

            } else {

                System.out.println(" lutfen tekrar deneyin");
            }

        }

scan.close();


    }
}
