package objects;

import interfaceses.A;

public class method2 implements A {


    private int num1;
    private int num2;
    private String name;

    public method2(int num1, int num2, String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public void mySum(){

         System.out.println(name+" "+(num1+num2));

     }

}
