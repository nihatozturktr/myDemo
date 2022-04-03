public class Patient {

    private String nationalRegistryNumber;
    private String fullName ;
    private int age;
    private int temperature;
    private boolean unKnownVirus;
    private boolean ensured;

    public Patient(String nationalRegistryNumber, String fullName, int age, int temperature, boolean unKnownVirus, boolean ensured) {
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.fullName = fullName;
        this.age = age;
        this.temperature = temperature;
        this.unKnownVirus = unKnownVirus;
        this.ensured = ensured;
    }

    public String getNationalRegistryNumber() {
        return nationalRegistryNumber;
    }

    public void setNationalRegistryNumber(String nationalRegistryNumber) {
        this.nationalRegistryNumber = nationalRegistryNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isUnKnownVirus() {
        return unKnownVirus;
    }

    public void setUnKnownVirus(boolean unKnownVirus) {
        this.unKnownVirus = unKnownVirus;
    }

    public boolean isEnsured() {
        return ensured;
    }

    public void setEnsured(boolean ensured) {
        this.ensured = ensured;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "nationalRegistryNumber='" + nationalRegistryNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", temperature=" + temperature +
                ", unKnownVirus=" + unKnownVirus +
                ", ensured=" + ensured +
                '}';
    }
}
