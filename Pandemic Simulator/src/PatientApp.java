import java.util.*;
import java.util.stream.Collectors;

public class PatientApp {

    public static void main(String[] args) {





        System.out.print(uniequePatients(Patient.getAllPatients()));

        System.out.println();
        System.out.println("************************************");

        System.out.print(emergencyPatients(Patient.getAllPatients()));

        System.out.println();
        System.out.println("************************************");

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




}
