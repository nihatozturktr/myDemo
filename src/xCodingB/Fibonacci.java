package xCodingB;

import java.sql.Connection;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which fibonacci number do you want?");
        int fibo = scan.nextInt();
        int fiboArray[] = new int[200];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        for (int i = 2; i <= fibo; i++) {
            fiboArray[i] = fiboArray[i - 2] + fiboArray[i - 1];
            System.out.println(i - 1 + ". fibonacci number is " + fiboArray[i - 2]);
        }
        System.out.println("============================");
        System.out.println(fibo + ". fibonacci number is " + fiboArray[fibo - 1]);

        Class.forName("mysql.jdbc.Driver");


    }
}



