package hoofdstuk_24.opdracht6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Maternity {
    public static void main(String[] args) {

        Person person = new Person("Ali", "Ozturk", LocalDate.now());
        Person person2 = new Person("Nihat", "Ozturk", LocalDate.now());



        Path path = Paths.get("//Users/nihat//Documents//Java Proje txt//nameList" + person.getFirstName() + ".txt");
       // IOProcessingStreamApp.createFile(path);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {

            objectOutputStream.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
