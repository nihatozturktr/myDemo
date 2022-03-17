package day40_Exception;

public class C07_NumberFormatException {
    public static void main(String[] args) {

        String str= "123a";
        int num = Integer.parseInt(str)+4;
        System.out.println(num);
    }
}
