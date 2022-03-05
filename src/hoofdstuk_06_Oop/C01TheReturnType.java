package hoofdstuk_06_Oop;

public class C01TheReturnType {
    // returns an int value 5
    static int returnFive() {
        return 5;
    }

    // has a parameter
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    // simply prints"Hello World!"
    static void sayHello() {
        System.out.println("Hello World!");
    }
    // public static void main(String[ ] args)
    //This definition indicates that the main method takes an array of Strings as its parameters, and does not return a value.
}
