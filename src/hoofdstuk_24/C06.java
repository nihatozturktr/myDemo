package hoofdstuk_24;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class C06 {
    public static void main(String[] args) {

        Path secretPath = Path.of("../../Secret_Folder/Secret_Mesaage.txt");

        try {
            if (Files.notExists(secretPath.getParent())) {
                Files.createDirectory(secretPath.getParent());
            }

            if(Files.notExists(secretPath)){
                Files.createFile(secretPath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(secretPath.toString())
        )){

            bufferedWriter.write("“The wolf is in the pig pen. I repeat: the wolf is in the pig pen.”");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {

            BufferedImage image = ImageIO.read(new URL("https://worldstories.org.uk/content/book/262/__picture_9352.jpg"));
            ImageIO.write(image, "jpg",new File("../../Secret_Folder/Secret_Picture.jpg"));

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    }

