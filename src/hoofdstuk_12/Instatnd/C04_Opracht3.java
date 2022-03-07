package hoofdstuk_12.Instatnd;

import java.time.DayOfWeek;
import java.util.Scanner;

public class C04_Opracht3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number from 1-7 to select day of week. (1 is monday, etc...");
        if (!keyboard.hasNextInt()) {
            System.out.println("Input is not a number, program exits");
            return;
        }

        int userDayNumber = keyboard.nextInt();
        if (userDayNumber < 1 || userDayNumber > 7) {
            System.out.println("Number entered not between 1 and 7, program exits");
            return;
        }

        DayOfWeek dayOfWeek;
        System.out.println("enter an integer as number of days to add.");
        if (!keyboard.hasNextInt()){
            System.out.println("Input is not a number, program exits");
            return;
        }

        int userDaysToAdd = keyboard.nextInt();
        if (userDaysToAdd < 0) {
            System.out.println("number entered not an integer, program exits");
            return;
        }

        dayOfWeek = DayOfWeek.of(userDayNumber).plus(userDaysToAdd);
        System.out.println("Initial day + number of days to add results in: " + dayOfWeek);



    }
}
