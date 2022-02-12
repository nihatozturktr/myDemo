package day21_Scope_Array;

public class C06_Arrays {

    public static void main(String[] args) {

       // Verilen bir array’in tum elemanlarini toplayan bir program yazalim.


        int arr[] ={2, 3, 4, 5, 1};

        int toplam=0;

        for (int i = 0; i < arr.length-1; i++) {

toplam+=arr[i];

        }
        System.out.println("Toplam :"+ toplam);

    }


}
