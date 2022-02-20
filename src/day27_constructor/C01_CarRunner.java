package day27_constructor;

public class C01_CarRunner {

    public static void main(String[] args) {

        C02_Car car = new C02_Car();
        System.out.println(car.km);


        C02_Car car2= new C02_Car();

       car2.km=12300;
       car2.year=2008;
       car2.sell=true;


        C02_Car car3= new C02_Car();

        car3.mark="Opel";
        car3.km=19000;
        car3.color="Red";





    }
}
