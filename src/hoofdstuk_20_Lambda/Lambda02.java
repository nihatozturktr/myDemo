package hoofdstuk_20_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public abstract class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(12,-3,65,3,7,34,22,-60,42,15));

        cifKareMax(list);
    }

    //List'in cift olan elemanlarin karelerini aliniz ve en buyugunu yazdiriniz
    public static void cifKareMax(List<Integer>list){

        Optional <Integer> maxEl= list.stream().filter(Lambda01::printCifBul).map(t->t*t).reduce(Integer::max);
        Optional <Integer> maxEl2= list.stream().filter(t->t%2==1).map(t->t*t).reduce(Integer::max);
        //reduce () returne
        System.out.println(maxEl);
        System.out.println("***");
        System.out.println(maxEl2);

    }
    //List'teki tum elemanlarin toplamini yazdiriniz.
    //LAmbda Expression...
    public static void  toplaEl1(List<Integer> list){
        int toplam = list.stream().reduce(0, (x, y) -> x + y);

    }


}