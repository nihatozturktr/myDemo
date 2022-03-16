package day40_Exception;

public class C01
{
    public static void main(String[] args) {

        int a =20;
        int b= 0;

        try{
            System.out.println(" a/b"+ (a/b));
        } catch (ArithmeticException e){

            System.out.println("Zero is not divisible by a number");
        }
        System.out.println(" Mission accomplished");

    }
}
