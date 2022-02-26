package hoofdstuk_10_Overerving;

public class C02_Main {
    public static void main(String[] args) {

       // C01_Employe employee =new C01_Employe ("Mustafa Murat", "Bili;im",4000);
        //C01_Employe.showInfos();

        C03_Manager manager =new C03_Manager("Ali","Bilisim",3000,10);

        manager.showInfos();
        manager.raiseSalary(100);
        System.out.println(manager.toString());// =System.out.println(manager)
        C01_Employe employee =new C03_Manager("Mustafa","IT",4000,10);


        employee.showInfos();



    }
}
