import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PatientApp2 {

    public static void main(String[] args) {










        // printEl(uniequePatients(Patient.getAllPatients()));

        // System.out.println();
        // System.out.println("-------------------------------------------");

        // printEl(emergencyPatients(Patient.getAllPatients()));

        // System.out.println(Patient.getAllPatients());

        // System.out.println();
        // System.out.println("-------------------------------------------");

        // System.out.print(ageAndTemperatureSorter(Patient.getAllPatients()));

        // System.out.println();
        // System.out.println("-------------------------------------------");

        // printEl(opdracht4(Patient.getAllPatients()));


    }


    public static List<Patient> uniequePatients (List<Patient> allPatients){// Opdracht 1


        return Patient.getAllPatients().
                stream().
                sorted(Comparator.comparing(Patient::getNationalRegistryNumber)).
                distinct().
                collect(Collectors.toList());//List of unique patients




    }
    public static List<Patient> emergencyPatients (List<Patient> allPatients){// Opdracht 2

        return Patient.getAllPatients().
                stream().
                filter((t -> t.getAge() < 65 && t.getTemperature() >= 38 || (t.getTemperature() >= 40 && t.isUnKnownVirus() == true))).
                distinct().
                collect(Collectors.toList());

    }
    public static List<Patient> ageAndTemperatureSorter (List<Patient> allPatients){

        return Patient.getAllPatients().
                stream().
                filter((t ->  t.getTemperature() >= 38 || (t.getTemperature() >= 40 && t.isEnsured() == true))).
                distinct().
                collect(Collectors.toList());



    } public static List<Patient> opdracht4 (List<Patient> allPatients){

        return Patient.getAllPatients().
                stream().
                filter((t ->  (t.getTemperature() >= 40 && t.getAge() >=65) || ((t.getTemperature() >= 38 && t.isUnKnownVirus() == true)))).
                distinct().
                collect(Collectors.toList());



       // List<Patient> category1 = Patient.getAllPatients().stream()
       //         .filter((e -> e.getAge() < 65 && e.getTemperature() >= 38 || (e.getTemperature() >= 40 && e.isUnKnownVirus() == true)))
       //         .distinct()
       //         .collect(Collectors.toList());
       // category1.forEach(System.out::println);
       // System.out.println( category1.size());
//
       // List<Patient> category2 = Patient.getAllPatients().stream()
       //         .filter((e -> e.getTemperature() >= 38 && e.isUnKnownVirus() == true))
       //         .distinct()
       //         .collect(Collectors.toList());
       // category2.forEach(System.out::println);
       // System.out.println( category2.size());
//
       // List<Patient> category3 = Patient.getAllPatients().stream()
       //         .filter((e -> e.getTemperature() <= 38 && e.isUnKnownVirus() == true))
       //         .distinct()
       //         .collect(Collectors.toList());
       // category3.forEach(System.out::println);
       // System.out.println( category3.size());








    }

    public static void printEl (List<Patient> allPatients){
        Patient.getAllPatients().stream().forEach(t-> System.out.println(t));


    }

    public static void printEL2(int t){
        System.out.print(t+ " ");

    }
}
