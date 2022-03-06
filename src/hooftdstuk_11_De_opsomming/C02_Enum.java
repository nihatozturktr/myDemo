package hooftdstuk_11_De_opsomming;

public class C02_Enum {

    private boolean dayOk;

    enum Days{
        MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIYDAY, SATURDAY,SUNDAY;

        Days() {
        }
    }
    enum Coin{ ONE_CENT, FIVE_CENT, FIFTY_CENT, ONE_EURO, TWO_EURO,
        ;

        Coin() {
        }
    }

    @Override
    public String toString() {
        return "C02{" +
                "dayOk=" + dayOk +
                '}';
    }
}















    /*public static void main(String[] args) {

        Days day1= Days.FRIYDAY;
        Days day2 = Days.WEDNESDAY;

        System.out.println(day1.toString());
        System.out.println(day2.name());*/



/**Why And When To Use Enums?
 Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
 *
 * */

