package hoofdstuk_8_KlassenDefieren;

public class C02_CarApp {
    private String color;
     private String model;
     private int door;
     private int engine;

    public C02_CarApp(String color, String model, int door, int engine) {
        this.color = color;
        this.model = model;
        this.door = door;
        this.engine = engine;
    }
    public C02_CarApp() {
        this.color = "Not information";
        this.model = "Not information";
        this.door = 0;
        this.engine = 0;
}
public void showInfos(){
    System.out.println();

}


}
