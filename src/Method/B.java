package Method;

public class B {



    public static int calculate(int i, int j){


        return i*j;


    }

    public static String name(String str1, String str2){


        return  str1+" "+str2;
    }



    public static void main(String[] args) {


        int num1=23;
        int num2= 34;
        String name1="Jhone";
        String name2 ="Aisha";

        calculate(num1,num2);
        name(name1,name2);


        System.out.println((calculate(num1,num2))+" "+(name(name1,name2)));




    }


}
