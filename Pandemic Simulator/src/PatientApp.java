import java.util.*;
import java.util.stream.Collectors;

public class PatientApp {

    public static void main(String[] args) {




        printEl(uniequePatients(Patient.getAllPatients()));

        System.out.println();
        System.out.println("************************************");

        printEl(emergencyPatients(Patient.getAllPatients()));

        System.out.println(Patient.getAllPatients());

        System.out.println();
        System.out.println("************************************");

        System.out.print(ageAndTemperatureSorter(Patient.getAllPatients()));

}


        public static List<Patient> uniequePatients (List<Patient> allPatients){// Opdracht 1


            return Patient.getAllPatients().
                    stream().
                    sorted(Comparator.comparing(Patient::getNationalRegistryNumber)).
                    distinct().
                    collect(Collectors.toList());


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

}
public static void printEl (List<Patient> allPatients){
    Patient.getAllPatients().stream().forEach(t-> System.out.println(t));


}








}

