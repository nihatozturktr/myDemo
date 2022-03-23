package hoofdstuk_16_Exception;

import java.util.Scanner;

public class Division_Finally {
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
            System.out.println("Invailid Number");
            System.out.println(nfe.getMessage());
        }catch(ArithmeticException ae){
            System.out.println("Division by 0");
            System.out.println(ae.getMessage());
            ae.printStackTrace();

        }finally{
            System.out.println("The Ende");

        }
    }


}
