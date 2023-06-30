package live_coding;

import java.time.LocalDate;
import java.time.Period;

public class Birthday {
    String df = "df";

    public static int years(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
    public static int month(LocalDate birthDate, LocalDate currentDate) {

        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getMonths();
        } else {
            return 0;
        }
    }
}
