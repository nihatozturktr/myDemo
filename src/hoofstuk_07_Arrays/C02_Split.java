package hoofstuk_07_Arrays;

import java.util.Arrays;

public class C02_Split {
    public static void main(String[] args) {
        // I learned Java and made money

        // Cumlesindeki kelimeleri ozel karekter ve noktalar olmadan harf sirasina gore yazdiralim

        String str= "I learned Java and made money";
        String words[]= str.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length ; i++) {

            words[i]=words[i].replaceAll("\\W", "");

            System.out.print(words[i]+ " ");

        }
        System.out.println(Arrays.toString(words));

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));
    }
}
