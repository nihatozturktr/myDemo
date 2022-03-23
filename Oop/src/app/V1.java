package app;

import interfaceses.A;
import objects.method2;
import objects.methodSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class V1 extends methodSum {
    public V1(int num1, int num2, String name) {
        super(num1, num2, name);
    }

    public static void main(String[] args) {


        V1 a1= new V1(12,14,"deneme");

        System.out.println("a1 "+a1);

        methodSum a2 = new methodSum(12,14,"deneme2");
        System.out.println("a2 "+a2);

        method2 a3 = new method2(10,12,"deneme3");




















    }
}
