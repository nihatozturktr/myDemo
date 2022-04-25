package hoofdstuk_24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class C03 {
    public static void main(String[] args) {

        try {
            Files.createDirectories(Paths.get("/Users/nihat/Documents"));
            Path myFile = Paths.get("/Users/nihat/Documents/newTxt.txt");

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
