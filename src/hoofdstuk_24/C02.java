package hoofdstuk_24;

public class C02 {

    private String name;
    private String surname;
    private int age;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public C02(String name, String surname, int age, int size) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.size = size;


    }
}
