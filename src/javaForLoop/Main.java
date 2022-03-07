package javaForLoop;

public class Main {

    public static void main(String[] args) {
     //   IDatabase database = new IDatabase() ; calismaz

        Customer customer = new Customer();
        Student student = new Student();


        IDatabase database = new Customer();
        IDatabase database2 = new Student();
        database.log();
        database2.log();
    }
}
