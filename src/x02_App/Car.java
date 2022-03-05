package x02_App;

public class Car {


    private String color;
    private String speed;
    private int horsePower;

    public Car(String color, String speed, int horsePower) {
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void accelerate(int amount){
     //accelerate =(amount +(horsePower/100);

    }
    public void slowDown(int amount){

    }
    public void park(){

    }
    public int getSpeed(){// Kontrol et
        return getSpeed();
    }
    public void setSpeed(int amount){

    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int amount) {
        this.horsePower = horsePower;
    }
}
