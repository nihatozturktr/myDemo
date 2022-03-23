package hoofdstuk_16_Exception.opdracht2;

import java.util.Scanner;

public class Division2 {

    public static void main(String[] args) {
        try{

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter 1. number");

            int num =Integer.parseInt(keyboard.next());

            System.out.println("Please enter 2. number");
            int den= Integer.parseInt(keyboard.next());
            int div = num/den;

            System.out.format("%d/%d=%d ",num,den,div);


            keyboard.close();

        }catch(NumberFormatException nfe){
            System.out.println("You did not enter a number");
            System.out.println(nfe.getMessage());
           }



}
}
