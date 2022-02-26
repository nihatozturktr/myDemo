package hoofdstuk_10_Overerving;

public class C01_Employe {
    private   String name;
    private  String department;
    private   int salary;// Sirket ID

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public C01_Employe(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }// Bir adet metot yazalim



    public void showInfos(){
    System.out.println("Information   :");
    System.out.println("Name :"+ this.name);
    System.out.println("Deparman :"+ this.department);
    System.out.println("Salary :"+ this.salary);
}
}
