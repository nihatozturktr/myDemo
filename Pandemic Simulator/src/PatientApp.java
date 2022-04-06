import java.util.*;
import java.util.stream.Collectors;

public class PatientApp {

    public static void main(String[] args) {

        List<Patient> uniequePatients =Patient.getAllPatients().
                stream().
                sorted(Comparator.comparing(Patient::getNationalRegistryNumber)).
                distinct().
                collect(Collectors.toList());

        printEl(uniequePatients);
        System.out.println(uniequePatients.size());

//-----------------------------------------------

        List<Patient> emergencyPatients =Patient.getAllPatients().
                stream().
                filter((t -> t.getAge() < 65 && t.getTemperature() >= 38 || (t.getTemperature() >= 40 && t.isUnKnownVirus() == true))).
                distinct().
                collect(Collectors.toList());

        printEl(emergencyPatients);
        System.out.println(emergencyPatients.size());



        List<Patient> ageAndTemperatureSorter =Patient.getAllPatients().
                stream().
                filter((t ->  t.getTemperature() >= 38 || (t.getTemperature() >= 40 && t.isEnsured() == true))).
                distinct().
                collect(Collectors.toList());

        printEl(ageAndTemperatureSorter);
        System.out.println(ageAndTemperatureSorter.size());


        //-----------------------------------------------3---

        List<Patient> category1 = Patient.getAllPatients().stream()
                .filter((e -> e.getAge() < 65 && e.getTemperature() >= 38 || (e.getTemperature() >= 40 && e.isUnKnownVirus() == true)))
                .distinct()
                .collect(Collectors.toList());
        category1.forEach(System.out::println);
        System.out.println( category1.size());

        List<Patient> category2 = Patient.getAllPatients().stream()
                .filter((e -> e.getTemperature() >= 38 && e.isUnKnownVirus() == true))
                .distinct()
                .collect(Collectors.toList());
        category2.forEach(System.out::println);
        System.out.println( category2.size());

        List<Patient> category3 = Patient.getAllPatients().stream()
                .filter((e -> e.getTemperature() <= 38 && e.isUnKnownVirus() == true))
                .distinct()
                .collect(Collectors.toList());
        category3.forEach(System.out::println);
        System.out.println( category3.size());

        List<Patient> category4 = Patient.getAllPatients().stream()
                .filter((e -> e.getTemperature() >= 38 && e.isEnsured() == true))
                .distinct()
                .collect(Collectors.toList());


        Map<Integer, List<Patient>> mapCollection = new HashMap<>();

        mapCollection.put(1, category1);
        mapCollection.put(2, category2);
        mapCollection.put(3, category3);
        mapCollection.put(4, category4);



        for(Map.Entry<Integer, List<Patient>> category : mapCollection.entrySet()){
            int key = category.getKey();

            System.out.println(category.getKey());
            System.out.println(category.getValue());








    }


}

        public static void printEl (List<Patient> allPatients){
            Patient.getAllPatients().forEach(t-> System.out.println(t));

}
}


