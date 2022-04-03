package hoofdstuk_20_Lambda;

import java.util.*;

public class LabmdaX {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList<>(Arrays.asList("Nihat","Esra","Leyla","Halit","esra","halit"));

        buyukHarfTekrarsiz(myList);





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
}
