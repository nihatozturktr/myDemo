package day40_Exception;

import java.sql.SQLOutput;
import java.util.Scanner;
@SuppressWarnings("resource")
public class C08_IllegalargumentException {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age");

        int yas= scan.nextInt();

        try {
            if (yas<0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println(yas);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Age cannot be less than zero");
        }


    }


}
