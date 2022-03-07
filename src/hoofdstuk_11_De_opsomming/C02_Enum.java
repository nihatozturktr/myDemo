package hoofdstuk_11_De_opsomming;

public class C02_Enum {

    public enum Day {
        MONDAY(true),
        TUESDAY(true),
        WEDNESDAY(true),
        THURSDAY(true),
        FRIDAY(true),
        SATURDAY(false),
        SUNDAY(false);

        private boolean weekDay;

        Day(boolean weekDay) {
            this.weekDay = weekDay;
        }

        public boolean isWeekDay() {
            return weekDay;
        }

        @Override
        public String toString() {
            return "Day{" +
                    "weekDay=" + weekDay +
                    "} ";
        }
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

