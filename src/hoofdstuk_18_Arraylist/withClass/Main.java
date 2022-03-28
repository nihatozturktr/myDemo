package hoofdstuk_18_Arraylist.withClass;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();


        customers.add(new Customer(1,"Nihat","Ozturk"));
        customers.add(new Customer(2,"Halit","Ozturk"));


        for(Customer customer:customers){
            System.out.println(customer.id);
        }

    }
}
