package hoofdstuk_Streaming_API.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String>  cities0 = new ArrayList<>();

        cities0.add("Gent");
        cities0.add("Antwerpen");


        MyList<String> cities = new MyList<>();
        cities.add("Liege");
        cities.add("Namur");



    }
}
