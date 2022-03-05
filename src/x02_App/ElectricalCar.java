package x02_App;

public class ElectricalCar extends Car{

    private int battery;
    public ElectricalCar(String color, String speed, int horsePower) {
        super(color, speed, horsePower);
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int charcge) {
        this.battery = charcge;
    }
    public void  acccelerate(int amount){


    }

    public void slowDown(int amount){

    }

    public void charge(int amount){

    }
}
