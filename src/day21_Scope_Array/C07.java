package day21_Scope_Array;

import java.util.Arrays;

public class C07 {
    public static void main(String[] args) {
        //What is the output of this code?
        /**
         * in this code,most important part is arr[i]=i for i from 0 to 3, mean 0,1,2 so res=arr[0]+arr[2]=0+2=2
         */
        int arr[ ] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;


        } System.out.println(Arrays.toString(arr));
        int res = arr[0] + arr[2];
        System.out.println(res);
    }
}
