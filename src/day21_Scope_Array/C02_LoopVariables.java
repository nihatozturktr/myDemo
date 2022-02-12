package day21_Scope_Array;


public class C02_LoopVariables {

    public static void main(String[] args) {
        int sayi =10;


        for (int i = 0;i <6;i++){

            String isim ="Ali";

            System.out.println(sayi+ " "+isim);

        }
        //System.out.println(isim); burada isim variable kullanamayiz.Cunku isim variable loop icerisinde olusturuldu.

        //Loop icerisinde olusturulan variable loop disinda kullanilamaz.
        //Bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa.
        //Loop'dan once olusturulur ve emniyette kalmak icin initialize yapariz( yani deger atariz)

        for(int i= 0; i < 10;i++){

            String isim = "Veli";

        }
    }
}
