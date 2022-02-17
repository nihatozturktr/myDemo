package x01_Graphic;



public class RectangleApp {

    public static void main(String[] args) {
        System.out.println("Thir program uses a rectangle");
        Rectangle rect =new Rectangle();

        rect.width=10;
        rect.height=5;

        rect.x=15;
        rect.y=18;


        System.out.println(rect.width);
        System.out.println(rect.height);

        System.out.printf("Position: (%d, %d)", rect.x,rect.y);



        Rectangle rect2 = new Rectangle();

        rect2.width=11;
        rect2.height=12;

        rect2.x=20;
        rect2.y=25;


        System.out.println(rect2.width);
        System.out.println(rect2.height);

        System.out.printf("Position: (%d, %d)", rect.x,rect.y);








    }
}
