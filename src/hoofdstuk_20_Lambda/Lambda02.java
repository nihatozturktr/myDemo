package hoofdstuk_20_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public abstract class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(12,-3,65,3,7,34,22,-60,42,15));

        cifKareMax(list);


        toplaEl1(list);
        System.out.println("***");

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
        int toplam = list.
                stream().
                reduce(0, (x, y) -> x + y);
        System.out.println(toplam);



    }
    public static void topla2(List<Integer> list){

        Optional<Integer> toplam = list.stream().reduce(Integer::sum);
        Optional<Integer> toplam2 = list.stream().reduce(Math::addExact);


    } public static void carpCiftEl(List <Integer> list){
        Optional<Integer> carp = list.stream().filter(Lambda01::printCifBul).reduce(Math::multiplyExact);
        System.out.println(carp);

    }
    public static void carpCiftEl2(List <Integer> list){
        int carp2 = list.stream().filter(Lambda01::printCifBul).reduce(1,(x,y)->(x*y));
        System.out.println(carp2);

    }

    public static void min1 (List <Integer> list){
       Optional min=  list.stream().reduce(Integer::min);
        System.out.println(min);


    }
    public static void min2 (List <Integer> list){
        Optional min2=  list.stream().reduce(Math::min);
        System.out.println(min2);


    }
    public static int minBul(int x, int y){

        return  x<y ?x:y;



    }

    public static void min3 (List <Integer> list){
        Optional min3=  list.stream().reduce(Lambda02::minBul);
        System.out.println(min3);


    }
    public static void min4 (List <Integer> list){
       Integer min = list.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
        System.out.println(min);




}
}
