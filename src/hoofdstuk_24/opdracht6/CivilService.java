package hoofdstuk_24.opdracht6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CivilService {

    public static void main(String[] args) {


        Path path = Paths.get("//Users/nihat//Documents//Java Proje txt//nameList.txt");

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {

            Person person = (Person) objectInputStream.readObject();
            System.out.println(person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}
