package hoofdstuk_22_Collection.Opdracht12;

public interface Person1 {
    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getGender();

    void setGender(String gender);

    int getAge();

    void setAge(int age);

    double getWeight();

    void setWeight(double weight);

    double getHeight();

    void setHeight(double height);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    String toString();

    int compareTo(Person o);
}
