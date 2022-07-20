package hoofdstuk_18_Arraylist.ArrayList;

import java.util.ArrayList;

public class Car {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        for(String i: cars){
            System.out.println(i);
        }
    }
}
