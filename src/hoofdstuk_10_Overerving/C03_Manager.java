package hoofdstuk_10_Overerving;

public class C03_Manager extends C01_Employe {
    private int num_of_employes;


    public C03_Manager(String name, String department, int salary,int num_of_employes) {
        super(name, department, salary);
        this.num_of_employes=num_of_employes;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void showInfos() {
        super.showInfos();
        System.out.println("Sorumlu kisi sayisi :" +this.num_of_employes);

    }

    public void raiseSalary(int amount){
        System.out.println("Calisanlara  "+ amount + " zam yapildi");

    }
}
