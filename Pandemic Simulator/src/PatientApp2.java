import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PatientApp2 {

    public static void main(String[] args) {

         printEl(uniequePatients(Patient.getAllPatients()));

         System.out.println();
         System.out.println("-------------------------------------------");

         printEl(emergencyPatients(Patient.getAllPatients()));
        System.out.println(Patient.getAllPatients().size());



         System.out.println();
         System.out.println("-------------------------------------------");

        printEl(ageAndTemperatureSorter(Patient.getAllPatients()));

        System.out.println(ageAndTemperatureSorter(Patient.getAllPatients()).size());

         System.out.println();
         System.out.println("-------------------------------------------");

         printEl(opdracht4(Patient.getAllPatients()));
        System.out.println(opdracht4(Patient.getAllPatients()).size());


    }


    public static List<Patient> uniequePatients (List<Patient> allPatients){// Opdracht 1


        return Patient.getAllPatients().
                stream().
                sorted(Comparator.comparing(Patient::getNationalRegistryNumber)).
                distinct().
                collect(Collectors.toList());//List of unique patients



        //..............




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
                collect(Collectors.toList()).;



    } public static List<Patient> opdracht4 (List<Patient> allPatients){

        return Patient.getAllPatients().
                stream().
                filter((t ->  (t.getTemperature() >= 40 && t.getAge() >=65) || ((t.getTemperature() >= 38 && t.isUnKnownVirus() == true)))).
                distinct().
                collect(Collectors.toList());










    }

    public static void printEl (List<Patient> allPatients){
        Patient.getAllPatients().stream().forEach(t-> System.out.println(t));


    }

    public static void printEL2(int t){
        System.out.print(t+ " ");

    }
}
