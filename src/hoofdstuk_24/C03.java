package hoofdstuk_24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your Name");

        String name = scan.nextLine();

        FileWriter write = new FileWriter(new File("/Users/nihat/Documents/Java Proje txt/newTxt2.txt"));

        writeDataToFile(Files.createDirectory(Paths.get(name)));



        try {
            Files.createDirectories(Paths.get("/Users/nihat/Documents/Java Proje txt"));
            Path myFile = Paths.get("/Users/nihat/Documents/Java Proje txt/newTxt.txt");

            if(Files.notExists(myFile)){
                Files.createFile(myFile);
            }

            writeDataToFile(myFile);




        } catch(IOException e){
            e.printStackTrace();

        }


    }
    public static void writeDataToFile (Path path){
        List<String> one = new ArrayList<>();

        one.add("hello");
        one.add("world");

        try{
            Files.write(path,one);
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }



}
