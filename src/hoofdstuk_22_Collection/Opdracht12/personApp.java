package hoofdstuk_22_Collection.Opdracht12;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class personApp {
    public static void main(String[] args) {
        SortedMap<String, Person> people = new TreeMap<>();
        Person person1 = new Person("Kemal", "Ozturk", "male", 30, 72.4, 174);
        Person person2 = new Person("Ayse", "Ozturk", "female", 29, 58.4, 165);
        Person person3 = new Person("Halit", "Kaptan", "male", 10, 36.6, 144);
        Person person4 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person5 = new Person("Hatice", "Kaplan", "female", 5, 20.4, 54);


        List<Person> personList = List.of(person1, person2, person3, person4, person5);
        for (Person person : personList) {
            people.put(person.getFirstName(), person);
        }
        people.forEach((name,person) -> System.out.println(person)); // print order is the alphbetical order of the keys
        System.out.println(people.get("Mert"));  // case sensitive - "mert" returns null
        System.out.println(people.firstKey());
        System.out.println(people.lastKey());
    }
}
