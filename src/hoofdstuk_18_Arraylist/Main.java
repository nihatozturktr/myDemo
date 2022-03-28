package hoofdstuk_18_Arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList num = new ArrayList();

        num.add(1);
        num.add(10);
        num.add("Ghent");
        System.out.println(num.size());

        num.get(2);
        num.get(2);

        System.out.println(num.get(2));


        num.set(2,5);



      //  num.remove(2);

        System.out.println(num.get(2));




    }
}
