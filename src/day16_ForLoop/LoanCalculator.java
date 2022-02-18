package day16_ForLoop;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            int ramount=0;
            //your code goes here

            //her ay kredi tutariin. yuzde 10 unu geri ode
            //1 ay odencek tutar  miktar%10
            //2. ay odenecek miktar = (miktar-miktar%)%10
            //3. ay odenecek miktar =



            for(int i= 0; i< 3;i++ ){

                ramount= amount*10/100;
                System.out.println(i +". taksit "+ramount);

                ramount=amount-ramount;






            }

    }
}
