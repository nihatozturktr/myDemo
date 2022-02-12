package day18_Overloading;

public class C01 {
 public static void skorHesapla(String name, int score){
     System.out.println(name+" isimli oyunucunun puani :"+score);

 }
    public static void skorHesapla( int score){
        System.out.println(" isimsiz oyunucunun puani :"+score);
    }

    public static void main(String[] args) {
        skorHesapla(2000);
       skorHesapla("Hasan",2000);
    }
}