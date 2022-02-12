package day21_Scope_Array;

public class C01_LocalVariables {


    String okulIsmi;// Calss level

    public static void main(String[] args) {


        /*
* Herhangi bir method icerisinde olusturulan variable’lardir (main method dahil).
* * Sadece o method icerisinde gecerlidir.
* *Baska methodlarda da kullanilacak variable’lari, local olusturmak yerine class level’da olusturmak gereklidir.
* Class level’da olusturulacak variable, main method’da kullanilacaksa static olarak olusturulmalidir. Bu durumda bu variable kullanacak,
*
*  diger method’lar da static olmalidir.
* Java local variable’lara default deger atamaz.*********
         */


        //int sayi ;//java: variable sayi might not have been initialized hatasi veririr. Deger atamasi yapmamiz gerekir.

      //  System.out.println(sayi);

      //  int sayi; bir local'de ayni isimde borden fazla variable olusturulmaz.
        //string sayi; // data turleri faki olsa da JAVA buna izin vermez.

    }

    public static void staticMethod(){
        //sayi; // bir local"de olusturulan variable (Method"larin static olup olmamamsina bakilmaksinzin ) farkli localde kullanilmaz.

        String isim = "Veli";


    }
}
