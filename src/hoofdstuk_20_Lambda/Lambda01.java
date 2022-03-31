package hoofdstuk_20_Lambda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*1) Lambda "Functional Programming"
        "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
        2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
        3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
        ve hatasiz code yazma acilarindan cok faydalidir.
        4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
        Lambda kullanmak hatasız code kullanmaktır.
        */

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12,14,15,19,21,55,61));

        printElStructured(list);
        System.out.println(" ");
        printElfunctional(list);
        System.out.println(" ");
        printElfunctional1(list);

        System.out.println(" ");


        printCiftElFunctional1(list);
        System.out.println();
        System.out.println("***");

        printCiftAltmisKucuk(list);

        System.out.println();
        System.out.println("***");

        tekYirmidenbuyukPrint(list);

        System.out.println();
        System.out.println("***");

        kupBirFazlaTekFunction(list);
        System.out.println();
        System.out.println("***");

        karakokCift(list);
        System.out.println();
        System.out.println("***");

        maxELfunction(list);



//structured Programing ile List elemanlarinin tamaini yazdiriniz.


    }
    public static void printElStructured(List<Integer> list){

        for (Integer w: list             ) {
            System.out.print(w +" ");

        }

    }

    public static void printElfunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+ " "));

    }
    //stream() : datalarin yukaridan asagiya akis sekline getirir
    //firEach() : datanin parametresine gore her bir elemani isler
    //Lambda operatoru
    //Lambda Expression yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullailir.-


    //Method Refrence --> create ettigimiz veya java dan aldigimiz method ile
     // ClassName::MethodName
    public static void printEL(int t){
        System.out.print(t+ " ");

    }
    public static void printElfunctional1(List<Integer> list){

        list.stream().forEach(Lambda01::printEL); // Method referans baska bir metodu

    }
    //structured programming  ile list elemanlarinin cift olanlarini ayni satirda aralarina bosluk birakarak yazdirin

    public static void  printCiftElScructured(List<Integer>list){
        for (Integer w:list) {
            if(w%2 == 0){
                System.out.println(w+ " ");
            }

        }

    }
    //Functional programming  ile list elemanlarinin cift olanlarini ayni satirda aralarina bosluk birakarak yazdirin
 public static void printCiftElFunctional1(List<Integer>list){
        //list.stream().filter(t->t%2==0).forEach(Lambda01::printEL);
     list.stream().filter(Lambda01::printCifBul).forEach(Lambda01::printEL);

 }

    public static boolean printCifBul(int i){

        return i%2==0;


    }
    //Functional programming  ile list elemanlarinin cift olanlarini 60 dan kucuk ayni satirda aralarina bosluk birakarak yazdirin
    public static void printCiftAltmisKucuk(List<Integer>list){
        list.stream().filter(t->t%2==0 & t<60).forEach(Lambda01::printEL);

    }

    //Functional programming  ile list elemanlarinin tek olanlarini veya  20 den buyuk olanlari ayni satirda aralarina bosluk birakarak yazdirin


    public static void tekYirmidenbuyukPrint(List<Integer>list){

        list.stream().filter(t->t%2==1 || t>20).forEach(Lambda01::printEL);
    }

    //Functional programming  ile list elemanlarinin cift olanlarini
    //Karelerini ayni satirda aralarina bosluk birakarak yazdirin

    public static void ciftKarePrint(List<Integer>list){

        list.stream().filter(Lambda01::printCifBul).map(t->t*t).forEach(Lambda01::printEL);
    }
    //Functional programming  ile list elemanlarinin tek olanlarini
    //Kuplerinin 1 fazlasini aralarina bosluk birakarak yazdirin

    public static void kupBirFazlaTekFunction(List<Integer>list) {

        list.stream().filter(t -> t % 2 == 1).map(t -> (t * t * t) + 1).forEach(Lambda01::printEL);

        //Functional programming  ile list elemanlarinin cift olanlarini
        //karakoklerini aynidatirda aralarina bosluk birakarak yazdirin


    }
    public static void karakokCift(List<Integer>list) {

        list.stream().filter(Lambda01::printCifBul).map(Math::sqrt).forEach(t->System.out.println(t+ " "));

        //Functional programming  ile list elemanlarinin cift olanlarini
        //karakoklerini aynidatirda aralarina bosluk birakarak yazdirin
    }
    //List'in en buyuk elemenini yazdiriniz
    public static void maxELfunction (List<Integer> list){

       Optional<Integer> maxEl = list.stream().reduce(Math::max);
        System.out.println(maxEl);

        //bircok datayi yek bir dataya cevirmek icin kullanilir.
        //reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir








    }


















}

