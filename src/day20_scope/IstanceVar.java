package day20_scope;

import static java.lang.System.*;

public class IstanceVar {

    int notMat=50;
    int notFen;


    public static void main(String[] args) {



        IstanceVar celil =new IstanceVar();
        IstanceVar nihal = new IstanceVar();


        nihal.notMat=10;


       System.out.println(nihal.notMat);;

    }
}
