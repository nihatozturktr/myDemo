package day35_encapsulation_inheritance;

public class C01 {


    private double point = 49.9;
    private boolean OK=false;



    public void setPoint(double point) {
        this.point = point;


    }

    public boolean isOK() {


        if(point>=50){
            OK = true;
    }
        return OK;


    }
}
