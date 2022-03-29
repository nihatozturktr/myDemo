package hoofdstuk_22_Collection;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("book","kitap");
        dictionary.put("table","masa");
        dictionary.put("computer","bilgisayar");

        System.out.println(dictionary);


        System.out.println(dictionary.size());

    }
}
