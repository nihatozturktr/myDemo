package day34_accesModifier_encapsulatoin;

public class C01 {


    private int numPrivate= 10;
    int numDefault= 20;
    protected int numProtected =30;
    public int numPublic =40;

    public static void main(String[] args) {
         C01 obj = new C01();
        System.out.println(obj.numPrivate);
        System.out.println(obj.numDefault;
        System.out.println(obj.numProtected);
        System.out.println(obj.numPublic);

    }
    public void noStatic(){
        C01 obj = new C01();
        System.out.println(obj.numPrivate);
        System.out.println(obj.numDefault;
        System.out.println(obj.numProtected);
        System.out.println(obj.numPublic);
    }



}
