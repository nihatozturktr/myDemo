package hoofdstuk_22_Collection.hashMapDemo;

import java.util.HashMap;

public class a {

    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("book","kitap");
        dictionary.put("table","masa");
        dictionary.put("computer","bilgisayar");

        /*System.out.println(dictionary);


        System.out.println(dictionary.size());

        System.out.println(dictionary.get("computer"));

        */
       // dictionary.remove("book");

        System.out.println(dictionary.get("book"));

        for (String item: dictionary.keySet()){
            System.out.println(item);
        }


    }
}
