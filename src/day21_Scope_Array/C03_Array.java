package day21_Scope_Array;

public class C03_Array {

    int num1;

    public static void main(String[] args) {
//Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu 	array’i yazdirin.



        String arr[]= new String[3];

        arr[0]="Ali";
        arr[1]="Veli";
        arr[2]="Fatma";

        String arr2[]= {"Ali","Veli","Ayse","Fatma"};


        System.out.println(arr2[1]);
        System.out.println(arr2[arr2.length-1]);// Strind dek' lengh() idi buradaki sacede leng.
        /*
         *
         * NOT 1 : 	“n” array’in length’i olmak uzere myArray[n-1] son elemani gosterir
         *NOT 2 : 	Bir Array’de olmayan index’i kullanmak isterseniz 	“ArraysIndexOutOfBoundsException” alirsiniz.
         *NOT : String ve Array icin length method’larinda dikkatli olmak gerekir.
		Strings ==> length( )
		Arrays ==> length

         */

        }


    }

