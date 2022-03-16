package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {


        int num1 =0;
        int sum= 0;
        int count =0;

        Scanner scan = new Scanner(System.in);

        try{ while (count <1000){
            System.out.println("Please enter number");

            num1 = scan.nextInt();
            sum+=num1;
            count++;
        }


        }catch (InputMismatchException e){
            System.out.println(" sum ="+sum);

        }

    }
}
