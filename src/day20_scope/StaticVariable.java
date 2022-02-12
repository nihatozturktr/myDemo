package day20_scope;

public class StaticVariable {

    static int no=20;
    static int sayi;
    static String adres= "Ankara";
    static String cadde;

    public static void main(String[] args) {

        System.out.println(no);
        StaticMethod();// Method cagirmassak calismaz

        System.out.println(no);

        // StaticOlmayanMethod(); buradan cagiramayiz

        StaticVariable obje =new StaticVariable();
        obje.StaticOlmayanMethod();




    }
    public static void StaticMethod(){

        System.out.println(no++);

        System.out.println(no++);
    }
    public void StaticOlmayanMethod(){


        //static variable'lara main method'dan dirakt ulasabilirler mi? EVET
        //static variable'lara static olan veya olmayan tum methodlar'dan ulasilabilir.
        //Bu nedenele static variable'lara CLASS VARIABLE denir/

        no++;

        System.out.println("Staticolmayan method'da sayi :"+ no);
    }
}
