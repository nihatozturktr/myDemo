package day17_Methoden;

/*3 adet metod olusturalim
 * (1) 3 ile carp metodu
 * (2) 2 ekle metodu
 * (3) 4 cikar
 *
 */




public class C04_Return {

    public static int ucilecarp(int a) {

return (a*3);


    }

    public static int ikiekle(int a){


        return (a+2);
    }

    public static int dortcikar(int a){

        return (a-4);
    }

    public static void main(String[] args) {
        System.out.println("sonuc  : "+ dortcikar(ikiekle(ucilecarp(10))));
    }

}



