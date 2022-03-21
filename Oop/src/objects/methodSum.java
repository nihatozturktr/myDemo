package objects;

public class methodSum extends method2 {


    public methodSum(int num1, int num2, String name) {
        super(num1, num2, name);



    }

    @Override
    public void mySum() {



        while(getNum1()<getNum2()){

            System.out.println(getNum1()*getNum2());
        }

}
}
