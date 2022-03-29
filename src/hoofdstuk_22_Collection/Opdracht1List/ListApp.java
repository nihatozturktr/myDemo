package hoofdstuk_22_Collection.Opdracht1List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListApp {

    public static void main(String[] args) {
        List<String> sentence = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        while(true){

            String word =scan.nextLine();
            sentence.add(word);

            if(word.endsWith(".")){
                break;
            }
        }



    }

}
