package day34_accesModifier_encapsulatoin;

public class C02 {

    public static void main(String[] args) {
        C01 obj =new C01();
       // System.out.println(obj.Private); private kendi class"si didisndan ulasilamaz
        System.out.println(obj.numDefault);
        System.out.println(obj.numPublic);

        C01 obj2 = new C01();
        C01 obj3 = new C01();
        C01 obj4 = new C01();
    }
}
