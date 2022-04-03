package hoofdstuk_20_Lambda.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Objeler1 {


    public static void main(String[] args) {
        Intec java2022 = new Intec("January", "Java", 12);
        Intec java2022IO = new Intec("MArch", "Pythone", 10);
        Intec ICTHelpDesk = new Intec("MArch", "HelpDesk", 13);
        Intec ICTHelpDesk2 = new Intec("MArch", "HelpDesk2", 15);






       List <Intec> myList2 = new ArrayList<>(Arrays.asList(java2022, java2022IO, ICTHelpDesk, ICTHelpDesk2));
    } //

    public static boolean ortlamaStudent(List <Intec>myList2){
     return myList2.
             stream().
             allMatch(t -> t.// her birimi eslestir
                     getStudentNum() > 12);





    }

}
