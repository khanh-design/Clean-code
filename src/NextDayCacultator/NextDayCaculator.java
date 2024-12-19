package NextDayCacultator;

import java.time.LocalDate;

public class NextDayCaculator {
    public static LocalDate getNextDay(int day, int month, int year) {
        LocalDate today = LocalDate.of(year, month, day);
        return today.plusDays(1);
    }
}
