package Polymorphism;


class Animal{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Hayvan konusuyor");

    }

}


public class Main {
    public static void main(String[] args) {

        Animal animal =new Animal("hayvan");
        Bird Bird =new Bird("limon");
        Dog dog =new Dog("Karabas");

        animal.speak();
        Bird.speak();
        dog.speak();


    }

}
class Bird extends Animal{


    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(getName()+ " otuyor");
    }
}
class Dog extends Animal{

    @Override
    public void speak() {
        super.speak();
        System.out.println(getName()+ " Havliyor");

    }

    public Dog(String name) {
        super(name);


    }
}