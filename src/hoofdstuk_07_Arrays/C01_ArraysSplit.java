package hoofdstuk_07_Arrays;

import java.util.Arrays;

public class C01_ArraysSplit {

    public static void main(String[] args) {
        String str ="It is possible java to learn";

        String arr[]= str.split(",");

        System.out.println(Arrays.toString(arr));


        //......................................

        String word = "it is beautiful java to learn";
        String words[]=word.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = words.length-1 ;i >= 0 ; i--) {

            System.out.println(words[i]+ " ");



        }


    }
}
