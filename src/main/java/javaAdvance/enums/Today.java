package javaAdvance.enums;


import io.cucumber.java.ja.但し;
import java.util.Arrays;
import java.util.Map;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
class Today {
    WeekDays weekDays;

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.printf("Go to work\n");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.printf("Take a rest\n");
                break;
        }
        System.out.printf("\nMood in this day is " + weekDays.getMood());
    }

    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
        Today today2 = new Today(WeekDays.SATURDAY);
        today2.daysInfo();
        System.out.printf(String.valueOf(today.weekDays));

        WeekDays w1 = WeekDays.MONDAY;
        WeekDays w2 = WeekDays.valueOf("MONDAY");
        System.out.printf("\n" + w2);

        WeekDays [] arr = WeekDays.values();
        System.out.printf("\n" + Arrays.toString(arr));
    }
}

