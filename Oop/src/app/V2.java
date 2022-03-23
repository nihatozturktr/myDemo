package app;

import interfaceses.A;

public class V2 implements A {

   private int num ;
    private String str =null;
   private int num2;

    public V2(int num, String str, int num2) {
        this.num = num;
        this.str = str;
        this.num2 = num2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}