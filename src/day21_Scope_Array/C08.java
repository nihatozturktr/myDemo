package day21_Scope_Array;

public class C08 {
    public static void main(String[] args) {
        //What is the output of this code?
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);
        /**
         * assign value : result=0
         * i=0,1,2,3,4
         * operations :
         * result+=i i==3,
         * result+=10 explain : i=0,
         * result+=0 =0 i=1,
         * result+=1 0+1=1 i=2,
         * result+=2 1+2=3 i=3,
         * result+=10 3+10=13 i=4,
         * result+=4 13+4=17 output : 17
         */
    }
}
