package hoofdstuk_20_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12,14,15,19,21,55,61));

        printElStructured(list);
        printElfunctional(list);



//structured Programing ile List elemanlarinin tamaini yazdiriniz.


    }
    public static void printElStructured(List<Integer> list){

        for (Integer w: list             ) {
            System.out.println(w +" ");

        }

    }

    public static void printElfunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.println(t+ " "));

    }



        }

