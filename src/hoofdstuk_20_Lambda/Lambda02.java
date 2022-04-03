package hoofdstuk_20_Lambda;

import java.util.*;

public abstract class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(12,-3,65,3,7,34,22,-60,42,15));

        cifKareMax(list);


        toplaEl1(list);
        System.out.println("***");


        min4(list);
        System.out.println("***");

        ciftKareKckBl(list);

        System.out.println("***");
        tekKareBygKsc(list);

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
    public static void  onbestenBykTekSayi(List <Integer> list) {
        System.out.println(list.
                stream().
                filter(t ->t % 2 == 1 & t>15).
                reduce(Integer::min)
                );
    }
    public static void ciftKareKckBl (List <Integer> list){

        list.stream().
                filter(Lambda01::printCifBul).
                map(t ->t*t).sorted().
                forEach(Lambda01::printEL);

    }

    public static void tekKareBygKsc(List <Integer>list){
        list.
                stream().filter(t->t*2!=0).
                map(t->t*t).
                sorted(Comparator.reverseOrder()).
                forEach(Lambda01::printEL);


    }

}
