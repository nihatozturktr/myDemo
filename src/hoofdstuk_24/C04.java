package hoofdstuk_24;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {


        try {
            FileWriter yaz=new FileWriter(" \"/Users/nihat/Documents/Java Proje txt/newTxt.txt");
            for(int i=0;i<100;i++) {
                System.out.println("Sırasyıla kaydedilmek istenen kullanıcının özelliklerini giriniz");
                System.out.println("isim giriniz");
                Scanner isimVerisi= new Scanner(System.in);
                Scanner numaraVerisi=new Scanner(System.in);
                String x=isimVerisi.next();
                System.out.println("Numara Giriniz");
                String y= String.valueOf(numaraVerisi.nextInt());
                System.out.println(x);
                System.out.println(y);
                yaz.write(x+ " " +y+"\n");
            }
            yaz.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
