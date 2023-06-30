package javaAdvance.enums;

public class EnumExample {

        void days(WeekDays weekDays) {
            System.out.printf("Today is " + weekDays);

        }


    public static void main(String[] args) {
        EnumExample t = new EnumExample();
        t.days(WeekDays.SUNDAY);
    }
}
