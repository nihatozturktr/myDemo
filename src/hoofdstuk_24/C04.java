package hoofdstuk_24;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        File myFile = new File("//..//..//nihatozturk.txt");

        if(!myFile.getParentFile().exists()){
            myFile.getParentFile().mkdir();

        }




    }
    }
