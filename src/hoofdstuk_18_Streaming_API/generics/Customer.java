package hoofdstuk_18_Streaming_API.generics;

public class Customer {
    int id;
    String firstName;

    public static void main(String[] args) {


        MyList<Customer> cities = new MyList<Customer>();
        cities.add(new Customer());
        cities.add(new Customer());

    }




}
