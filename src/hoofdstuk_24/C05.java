package hoofdstuk_24;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C05 {
     public static void main(String[] args) {
        String myStr ;
        Path myTxtPad = Path.of("myTxt");
        writeDataToFile(myTxtPad);
        pictureDownload();
    }

    private static void pictureDownload() {

        try(InputStream in = new URL("https://worldstories.org.uk/content/book/262/__picture_9352.jpg").openStream()){
            Files.copy(in, Paths.get("C:\\Users\\userpfe\\Desktop\\Java_txt\\image.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void writeDataToFile(Path path) {
        try (FileWriter fileWriter = new FileWriter(path.toFile(),true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {


            bufferedWriter.write("The wolf is in the pig pen.\n");        // hello\n
            bufferedWriter.write("I repeat: the wolf is in the pig pen." + "\n");   // world\n
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
