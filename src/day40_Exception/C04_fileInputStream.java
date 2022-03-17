package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_fileInputStream {
    public static void main(String[] args) {

        try{

            FileInputStream fis = new FileInputStream("/Users/nihat/Documents/test.txt");
        } catch(FileNotFoundException e){

            System.out.println("File not readable");
        }

    }
}
