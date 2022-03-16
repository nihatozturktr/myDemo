package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {
         int arr[] ={2,3,5,4,6,7,5,6,};



         try{
             Scanner scan = new Scanner(System.in);
             System.out.println("Please enter an index to print elementary ");
             int index = scan.nextInt();

             System.out.println("Your elementary "+ arr[index]);


         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Your index is not in the array");
         } catch (InputMismatchException e){
             System.out.println("Your index must be an integer");

         }





    }
}
