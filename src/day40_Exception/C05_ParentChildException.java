package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildException {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try{

            fis = new FileInputStream("/Users/nihat/Documents/test");
            int k =0;


            while((k=fis.read())!=-1){

                System.out.println((char)k);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e){

            e.printStackTrace();

        }

        System.out.println(" ");
        System.out.println("Mission accomplished");
    }



}
