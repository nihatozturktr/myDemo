package a_HomeWork;

public class intArrayTools {
//Arraydeki sayilari siranlanmis mi kontrol et true veya false dondur.
    //Sayilari buyukten kucuge veya kucukten buyuge siralayan bir method olusturun.


    int myArray2 []={1,6,9,222}; // Klasin icerisidne yazdim diger methodlarda da kullabailirim

public static boolean isSorted(int [] myArray2){

    for (int i = 0; i < myArray2.length-1 ; i++) {// Array in 1. indeksi ile 2. indeksini karsilastirip 1. indeks < 2. indeks  bakmaliyiz

        if(myArray2[0]<myArray2[1]){
            return true;
        }else return false;
    }

    return false;
}
public static int sort(int [] myArray2){



return(myArray2.length);
}
}

