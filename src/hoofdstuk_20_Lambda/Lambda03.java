package hoofdstuk_20_Lambda;

import java.util.*;

public class Lambda03 {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList<>(Arrays.asList("Nihat","Esra","Leyla","Halit","esra","halit"));

        buyukHarfTekrarsiz(myList);
        System.out.println();
        System.out.println("  *** ");

        karekterSayisiKucuktenBuyuge(myList);

        System.out.println();
        System.out.println("  *** ");

        yediVeYedidenAz(myList);

        System.out.println();
        System.out.println("  *** ");


        wBaslmaKOntrol(myList);
        System.out.println();
        System.out.println("  *** ");

        siralamaTest(myList);





    }// List elemanlari alfabetik buyuk harf ve tekrarsiz yazdiriniz
    public static void buyukHarfTekrarsiz (List<String> myList){

      myList.
              stream().// Akisa girdi
              map(String::toUpperCase).// elemanlar buyuk harf update edildi
              sorted().//alfabetik sira
              distinct().// tekrarsiz yapildi
              forEach(t->System.out.print(t + " "));

    }
    // List elemanlarinin karekter sayisini sirali olarak tekrarsiz yazdiriniz

    public static void karekterSayisiTekrarsizSirali (List<String> myList){

        myList.
                stream().map(t->t.length()).// String data karekter sayisina update edildi
                sorted(Comparator.reverseOrder()).// ters siralama yaptim
                distinct().
                forEach(Lambda01::printEL);
    }

    //Elemanlari karekter sayisina gore kucukten buyuge gore yazdir

    public static void karekterSayisiKucuktenBuyuge(List<String>mylist){
        mylist.stream().sorted(Comparator.comparing(t->t.length())). forEach(t->System.out.print(t + " "));


    }
    //List elemanlarini son harfine gore ters sirali yazdirin

    public static void sonHarfTesSiraliEl(List<String> myList){
        myList.// Nihat buraya geldi
                stream().//Karsilastirma metotlarini barindiran cklass
                sorted(Comparator.//Nihat ismi buraya  geldi.
                        comparing(t->t.toString().// comparing >> karsilastiran metot>> t olan Nihat ismi toString metodu ile String'e cevirdi, indexOF da kullanilabilirdi.
                                charAt(t.toString().length()-1)).// t.toString().length()-1)) >> son index e karsilik gelen index i verir
                        reversed()).//elemanin son index inin karekterini ters siralama yapar
                forEach(t->System.out.println(t + " "));

    }
    // cift sayili elamanlarin karelerini yazdiran tekrarli olanlari sadece bir kere buyukten kucuge dogru yazdiran program yazdiriniz.

    public static void ciftKareTekrarsizTersSira(List<String>myList){//elemanlarin karekter sayisi cift olacak

        myList.stream().
                map(t->t.length()*t.length()).
                filter(Lambda01::printCifBul).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(Lambda01::printEL);

    }
    public static void yediVeYedidenAz(List<String>myList){//elemanlarin karekter sayisi cift olacak


          //boolean  kontrol =  myList.stream().allMatch(t->t.length()<=7);


          //if(kontrol){
          //    System.out.println("List elemanlari 7 den buyuk");
          //}else{
          //    System.out.println("List elemanlari 7 den buyuk degil");
          //}
        //Sytem.out.println(kontrol);
//------------------------------------------------sart----------------ise--------------------tru---else-----------false-----------------
        System.out.println(myList.stream().allMatch(t->t.length()<=7) ?"List elemanlari 7 den buyuk":"List elemanlari 7 den buyuk degil");// ternary yaptik




}
//list elemanlarinin "N" ile baslamasini kontrol ediniz

    public static void wBaslmaKOntrol (List<String> myList){

        //----------------------------------eslesmesin-----------
        System.out.println(myList.stream().noneMatch(t->t.startsWith("N"))?" N ile baslan kelime yok":" N ile baslan kelime var"


        );
    }

    //List elemanlarinin "x " ile biten en az bir elemani kontrol ediniz
    public static void xBitmeKontrol(List <String> myList){
        
    }

    public static void siralamaTest (List <String> myList){


    }

}
